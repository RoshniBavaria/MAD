package com.example.dharmendra.firstapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class Bars extends AppCompatActivity {
    SeekBar sb_red;
    SeekBar sb_green;
    SeekBar sb_blue;
    int r,g,b;
    ConstraintLayout co;
    Color mcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars);

        sb_red = findViewById(R.id.red);
        sb_green= findViewById(R.id.green);
        sb_blue = findViewById(R.id.blue);
        co = findViewById(R.id.lay);
        updateBackground();

        sb_red.setOnSeekBarChangeListener(seekBarChangeListener);
        sb_green.setOnSeekBarChangeListener(seekBarChangeListener);
        sb_blue.setOnSeekBarChangeListener(seekBarChangeListener);


    }

    private  SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//            Toast.makeText(this,progress,Toast.LENGTH_SHORT()).show();
            updateBackground();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private void updateBackground()
    {
        r = sb_red.getProgress();
        g = sb_green.getProgress();
        b = sb_blue.getProgress();

//        co.setBackgroundColor(0xff000000 + r * 0x10000 + g * 0x100 + b);
        co.setBackgroundColor(Color.argb(255,r,g,b));
    }



}
