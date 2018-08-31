package com.example.dharmendra.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.dharmendra.firstapp.R.id.corgi;

public class ImageButton extends AppCompatActivity {
//    ImageButton cor,sh;
    android.widget.ImageButton cor,sh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        cor = findViewById(R.id.corgi);
        sh = findViewById(R.id.shiba);

        cor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ImageButton.this,Image1.class);
                startActivity(i);
            }
        });

        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ImageButton.this,Image2.class);
                startActivity(i);
            }
        });
    }
}
