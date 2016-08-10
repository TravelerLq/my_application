package com.example.admin.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Admin on 2016/8/10.
 */
public class FruitAdapter extends ArrayAdapter {
    int itemId;
    public FruitAdapter(Context context, int resource, List<Fruit> objects ) {
        super(context, resource, objects);


    }
}
