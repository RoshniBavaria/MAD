package com.example.dharmendra.firstapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener{
EditText uname;
EditText pass;
TextView lbl;
Button ok;
Button cancel;
String s_uname, s_pwd;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uname = findViewById(R.id.uname);
        pass = findViewById(R.id.pwd);
        lbl = findViewById(R.id.label);
        ok = findViewById(R.id.ok);
        cancel = findViewById(R.id.Cancel);

        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ok){
            s_uname = uname.getText().toString();
            s_pwd = pass.getText().toString();
            if (s_uname.equals("roshni") && s_pwd.equals("roshni")){
                lbl.setText("U got it right!");
                Toast.makeText(this,"Good enough!",Toast.LENGTH_SHORT).show();
            }
            else lbl.setText("No bro!");
        }
        else{
//            uname.setText("");
//            pass.setText("");
            Intent i = new Intent(this,MainActivity.class);
            i.putExtra("name",uname.getText());
            startActivity(i);
        }
    }
}
