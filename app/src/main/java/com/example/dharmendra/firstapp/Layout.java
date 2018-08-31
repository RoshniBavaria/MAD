package com.example.dharmendra.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Layout extends AppCompatActivity {
    EditText name;
    Button btn;
    CheckBox c1,c2;
    RadioGroup rg;
    String str_rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        btn = findViewById(R.id.ok);
        name = findViewById(R.id.name);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        rg = findViewById(R.id.rg);
        str_rg="Male";

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(Layout.this, MainActivity.class);
//                i.putExtra("empname",name.getText().toString());
//                i.putExtra("gender",rg.getCheckedRadioButtonId());
//                String hobbies[]= new String[2];
//                if(c1.isChecked())
//                {
//                    hobbies[0]=c1.getText().toString();
//                }
//                if(c2.isChecked())
//                {
//                    hobbies[1]=c2.getText().toString();
//                }
//                //i.putExtra("hobbies",hobbies);
//                startActivity(i);
                name.setText("ok");
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.male){
                    str_rg="Male"; }
                 else str_rg="Female";
            }
        });
    }
}
