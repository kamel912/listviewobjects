package com.mk.listviewobjects;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.mk.listviewobjects.models.ObjectModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SevenTG on 02/04/2017.
 */

public class CustomeAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    List<ObjectModel> objectModels;
    public CustomeAdapter(Context context, List<ObjectModel> objectModels) {
        this.objectModels = objectModels;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return objectModels.size();
    }

    @Override
    public Object getItem(int i) {
        return objectModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_item,null);
        TextView objectName = (TextView) view.findViewById(R.id.object_name);
        ImageView objectImage = (ImageView) view.findViewById(R.id.object_image);
        TextView objectPhone = (TextView) view.findViewById(R.id.object_phone);
        TextView objectAddress = (TextView) view.findViewById(R.id.object_address);
        RatingBar objectRatingBar = (RatingBar) view.findViewById(R.id.object_rating);

        objectName.setText(objectModels.get(i).getObjectname());
        objectImage.setImageResource(objectModels.get(i).getImage());
        objectPhone.setText((CharSequence) objectModels.get(i).getPhones(0));
        objectAddress.setText(objectModels.get(i).getSreetNumber()+ " " + objectModels.get(i).getStreetName() + " " + objectModels.get(i).getBesides());
        objectRatingBar.setRating(objectModels.get(i).getRating());

        return view;
    }
}
