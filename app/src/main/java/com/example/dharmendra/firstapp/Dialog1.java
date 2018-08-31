package com.example.dharmendra.firstapp;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Dialog1 extends DialogFragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialogfragment,container,false);
        getDialog().setTitle("Login Dialog");
        final EditText ed1 = v.findViewById(R.id.Name);
        EditText ed2 = v.findViewById(R.id.Pass);
        Button b1 = v.findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(ed1.getText().toString());

            }
        });
        return v;
    }

    public void buttonClicked(String str)
    {
        df.onButtonClicked(str);
        dismiss();
    }


    public interface DFragListener {
        public abstract void onButtonClicked(String str);
    }
    DFragListener df;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        df = (DFragListener) activity;
    }
}
