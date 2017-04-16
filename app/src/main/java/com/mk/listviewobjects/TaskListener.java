package com.mk.listviewobjects;

import com.mk.listviewobjects.models.ObjectModel;

import java.util.List;

/**
 * Created by SevenTG on 07/04/2017.
 */

public interface TaskListener {
    public void onTaskFinish(List<ObjectModel> objectModels);
}
