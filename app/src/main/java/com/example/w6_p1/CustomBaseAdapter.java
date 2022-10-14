package com.example.w6_p1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String listAnimal[];
    LayoutInflater inflater;

    public CustomBaseAdapter( String [] animalList){
        this.listAnimal = animalList;
    }
    @Override
    public int getCount() {
        return listAnimal.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txtView = new TextView(view.getContext());
        txtView.setText(listAnimal[i]);

        return txtView;
    }
}
