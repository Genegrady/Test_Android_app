package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText first;
    EditText second;

    public void add(View v){
        double F_value;
        double S_value;
        double R_value;

        result = (TextView) findViewById(R.id.result);

        F_value = Double.parseDouble(first.getText().toString());
        S_value = Double.parseDouble(second.getText().toString());
        R_value = F_value + S_value;

        result.setText(Double.toString(R_value));
    }
    public void sub(View v){
        double F_value;
        double S_value;
        double R_value;

        result = (TextView) findViewById(R.id.result);

        F_value = Double.parseDouble(first.getText().toString());
        S_value = Double.parseDouble(second.getText().toString());
        R_value = F_value - S_value;

        result.setText(Double.toString(R_value));
    }
    public void mult(View v){
        double F_value;
        double S_value;
        double R_value;

        result = (TextView) findViewById(R.id.result);

        F_value = Double.parseDouble(first.getText().toString());
        S_value = Double.parseDouble(second.getText().toString());
        R_value = F_value * S_value;

        result.setText(Double.toString(R_value));
    }
    public void div(View v){
        double F_value;
        double S_value;
        double R_value;

        result = (TextView) findViewById(R.id.result);

        F_value = Double.parseDouble(first.getText().toString());
        S_value = Double.parseDouble(second.getText().toString());
        R_value = F_value / S_value;

        result.setText(Double.toString(R_value));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
    }
}
