package com.example.dharmendra.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Calculator extends AppCompatActivity {

    int[] nb = {R.id.b0, R.id.b1, R.id.b2, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7, R.id.b8, R.id.b9};
    int[] op = {R.id.plus, R.id.minus, R.id.divide, R.id.multiply };
    TextView label;
    Boolean last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        label = findViewById(R.id.label);

        setNumericOnClickListener();
        setOperatorOnClickListener();
    }

    public void setNumericOnClickListener()
    {
        View.OnClickListener listener = new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Button btn = (Button) v;

                label.append(btn.getText());

                last = true;
            }
        };
        for (int i : nb )
        {
            findViewById(i).setOnClickListener(listener);
        }
    }

    public void setOperatorOnClickListener()
    {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(last)
                {
                    Button btn = (Button) v;
                    label.append(btn.getText());
                    last = false;
                }
            }
        };
        for (int i : op)
        {
            findViewById(i).setOnClickListener(listener);
        }

        findViewById(R.id.decimal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(last)
                {
                    label.append(".");
                    last = false;
                }
            }
        });

        findViewById(R.id.C).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                label.setText("");
                last = false;
            }
        });

        findViewById(R.id.equalto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqual();
            }
        });
    }

    public void onEqual()
    {
        if (last)
        {
            String txt = label.getText().toString();
            Expression expression = new ExpressionBuilder(txt).build();
            try {
                double result = expression.evaluate();
                label.setText(Double.toString(result));

            } catch (ArithmeticException ex) {
                label.setText("Error");
                last = false;
            }
        }
        }
    }

