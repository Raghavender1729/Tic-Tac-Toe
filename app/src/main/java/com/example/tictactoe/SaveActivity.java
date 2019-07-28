package com.example.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaveActivity extends Activity {

    private TextView text;
    private EditText edit;
    private Button button;
    private Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        text = (TextView)findViewById(R.id.text);
        edit = (EditText)findViewById(R.id.edit);
        button  = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edit.getText().toString().equals("")){
                    finish();
                }
            }
        });
        text.setText(getIntent().getStringExtra("score"));
    }
}
