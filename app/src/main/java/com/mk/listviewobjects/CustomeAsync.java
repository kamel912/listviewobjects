package com.mk.listviewobjects;

import android.app.Activity;
import android.os.AsyncTask;

import com.mk.listviewobjects.models.ObjectModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SevenTG on 02/04/2017.
 */

public class CustomeAsync extends AsyncTask<String,String,ArrayList<ObjectModel>> {

    private final TaskListener taskListener;

    public CustomeAsync(Activity activity){
        taskListener = (TaskListener) activity;
    }
    @Override
    protected ArrayList<ObjectModel> doInBackground(String... strings) {
        publishProgress("Open connection");
        String res = "";
        try {
            URL url = new URL(strings[0]);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String line = "";
            while ((line=bufferedReader.readLine())!= null){
                stringBuffer.append(line+"\n");
            }
            res = stringBuffer.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        publishProgress("Read Json file");
        ArrayList<ObjectModel> objectModels = new ArrayList<>();
        JSONArray jarray = null;
        try {
            jarray = new JSONArray(res);
            for (int i = 0; i <jarray.length() ; i++) {
                JSONObject object = jarray.getJSONObject(i);
                ObjectModel model = new ObjectModel();
                model.setObjectname(object.getString("obj_name"));
              //  model.setImage(R.drawable.img1+i);
                model.setCategoryName(object.getString("cat_name"));
                model.setRegion(object.getString("reg_name"));
                model.setRating(Float.parseFloat(object.getString("obj_rating")));
                List<ObjectModel.Phone> phoneList = new ArrayList<>();
                for (int j=0;j<object.getJSONArray("phone").length();j++){
                    ObjectModel.Phone phone = new ObjectModel.Phone();
                    phone.setPhone(object.getJSONArray("phone").getJSONObject(j).getString("phone"));
                }
                model.setPhones(phoneList);

                objectModels.add(model);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        publishProgress("Finish and retrun values");
        return objectModels;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        // Toast.makeText(, values[0], Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostExecute(ArrayList<ObjectModel> objectModels) {
        super.onPostExecute(objectModels);
        taskListener.onTaskFinish(objectModels);

    }
}
