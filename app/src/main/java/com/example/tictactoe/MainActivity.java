package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private Button button1;
    private Button button2;
    private Spinner spinner1;
    private Spinner spinner2;
    private ArrayList<String>str = new ArrayList<>();
    private int n = 0;
    private int t = 0;

    private Intent intent = new Intent();
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        dialog = new AlertDialog.Builder(this);

        str.add("Easy");
       // str.add("Medium");
        str.add("Difficult");
        spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_spinner_dropdown_item,str));
        ((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    n = 0;
                }
                else if (position == 1){
                    n = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setAdapter(new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_spinner_dropdown_item,str));
        ((ArrayAdapter)spinner2.getAdapter()).notifyDataSetChanged();

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    t = 0;
                }
                else if (position == 1){
                    t = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t == 0){
                    intent.setClass(getApplicationContext(),ScoreActivity.class);
                    startActivity(intent);
                }
                else if (t == 1){
                    intent.setClass(getApplicationContext(),HardScoreActivity.class);
                    startActivity(intent);
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n == 0){
                    intent.setClass(getApplicationContext(),EasyActivity.class);
                    startActivity(intent);
                }
                else if (n == 1){
                    intent.setClass(getApplicationContext(),HardActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
