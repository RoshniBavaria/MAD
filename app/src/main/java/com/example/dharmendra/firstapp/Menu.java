package com.example.dharmendra.firstapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class Menu extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn = findViewById(R.id.btn);
        //registerForContextMenu(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(1);
            }
        });
        {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        menu.add(0, 0, 0, "Menu Item 1");
        menu.add(1, 0, 1, "Menu Item 2");
        SubMenu sb = menu.addSubMenu(2, 0, 2, "Menu Item 3");
        sb.add(0, 1, 0, "add");

        return super.onCreateOptionsMenu(menu);
    }

    // @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == 0)
//        {
//
//        }
//        return super.onOptionsItemSelected(item);
//    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "update");
        menu.add(0, 1, 0, "delete");
    }


    @Override
    protected Dialog onCreateDialog(int id) {
        DatePickerDialog dp = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            }
        }, 2018, 7, 21);

        return dp;

    }



}
