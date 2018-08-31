package com.example.dharmendra.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {
ListView lv;
String countries[];
int[] img = {android.R.drawable.btn_star,android.R.drawable.btn_star,android.R.drawable.btn_star};
Spinner spin;
AutoCompleteTextView auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        lv = findViewById(R.id.lv);
        spin = findViewById(R.id.spin);
        auto = findViewById(R.id.auto);
        countries = getResources().getStringArray(R.array.Country);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,countries);
        ArrayAdapter as = new ArrayAdapter(this,android.R.layout.simple_spinner_item,countries);
        ArrayAdapter<String> at = new ArrayAdapter(this,android.R.layout.select_dialog_item,countries);

        lv.setAdapter(ad);
        spin.setAdapter(as);
        auto.setThreshold(1);
        auto.setAdapter(at);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Display.this,countries[position],Toast.LENGTH_SHORT).show();
//                TextView txt = (TextView) view;
//                Toast.makeText(Display.this,txt.getText().toString(),Toast.LENGTH_SHORT);
            }
        });

        CustomAdapter ca = new CustomAdapter(this, countries, img);
        lv.setAdapter(ca);
    }
}
