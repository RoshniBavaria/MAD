package com.example.dharmendra.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    TextView name;
    TextView gender;
    EditText hobbies;
    String st;
    RadioButton st1;
    String[] st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencing of the UI Elements
        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        hobbies = findViewById(R.id.hobby);

        Intent i = getIntent();
        st = i.getExtras().getString("empname");
        st2 = i.getExtras().getStringArray("hobbies");
        st1.setId(i.getExtras().getInt("gender"));
        name.setText(st);
        gender.setText(st1.getText().toString());

        for (int j=0; j< st2.length ; j++)
        {
            hobbies.append(st2[j]);
            hobbies.append("\n");
        }
    }
}


