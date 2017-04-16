package com.mk.listviewobjects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.mk.listviewobjects.models.ObjectModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TaskListener {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        new CustomeAsync(this).execute("");


    }

    @Override
    public void onTaskFinish(final List<ObjectModel> objectModels) {
        CustomeAdapter adapter = new CustomeAdapter(this,objectModels);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String objectId = objectModels.get(position).getId();
                Intent intent = new Intent(MainActivity.this,SingleObjectActivity.class);
                intent.putExtras(objectId,);
            }
        });
    }
}
