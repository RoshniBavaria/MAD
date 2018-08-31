package com.example.dharmendra.firstapp;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Dialog extends AppCompatActivity implements Dialog1.DFragListener {
    Button b1,b2;
    FragmentManager fm = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog1 df = new Dialog1();
                df.show(fm,"Yes");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AFrag ad = new AFrag();
                ad.show(fm, "no");
            }
        });

    }

    @Override
    public void onButtonClicked(String str) {
        Toast.makeText(this,str, Toast.LENGTH_SHORT).show();

    }


    public static class AFrag extends DialogFragment{
        @Override
        public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setIcon(android.R.drawable.btn_star);
            builder.setMessage("Alert Message");
            builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.setNegativeButton("Reset", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            return builder.create();
        }
    }
}
