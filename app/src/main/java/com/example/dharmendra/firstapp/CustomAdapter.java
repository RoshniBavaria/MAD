package com.example.dharmendra.firstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

    Context context;
    String[] countries;
    int [] imgs;

    public CustomAdapter(Context context, String[] countries, int[] imgs){
        this.context = context;
        this.countries = countries;
        this.imgs = imgs;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.customcell,null);
        TextView tv = v.findViewById(R.id.tv);
        ImageView img = v.findViewById(R.id.im);
        tv.setText(countries[position]);
        img.setImageResource(imgs[position]);
        return v;
    }
}
