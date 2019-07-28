package com.example.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class EasyActivity extends Activity {

    private TextView text1;
    private TextView text2;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Intent intent = new Intent();

    private int n = 0;
    private int b = 0;
    private int s = 0;
    private int t = 0;
    private ArrayList<Integer>k = new ArrayList<>();
    Random r = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        linear1 = (LinearLayout)findViewById(R.id.linear1);
        linear2 = (LinearLayout)findViewById(R.id.linear2);
        linear3 = (LinearLayout)findViewById(R.id.linear3);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button1.getText().toString().equals("")){
                        button1.setText("X");
                        k.add(Integer.valueOf(1));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button2.getText().toString().equals("")){
                        button2.setText("X");
                        k.add(Integer.valueOf(2));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button3.getText().toString().equals("")){
                        button3.setText("X");
                        k.add(Integer.valueOf(3));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button4.getText().toString().equals("")){
                        button4.setText("X");
                        k.add(Integer.valueOf(4));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button5.getText().toString().equals("")){
                        button5.setText("X");
                        k.add(Integer.valueOf(5));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button6.getText().toString().equals("")){
                        button6.setText("X");
                        k.add(Integer.valueOf(6));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button7.getText().toString().equals("")){
                        button7.setText("X");
                        k.add(Integer.valueOf(7));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button8.getText().toString().equals("")){
                        button8.setText("X");
                        k.add(Integer.valueOf(8));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(n==5)){
                    if (button9.getText().toString().equals("")){
                        button9.setText("X");
                        k.add(Integer.valueOf(9));
                        check();
                        end();
                        if (!(n==5)){
                            while (true){
                                if (k.contains(b)){
                                    if (k.size() < 10){
                                        b = r.nextInt(10 - 1) + 1;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                else {
                                    k.add(Integer.valueOf(b));
                                    break;
                                }
                            }
                            AI();
                            check();
                            end();
                        }
                    }
                }

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=0;
                b=0;
                t=0;
                k.clear();
                k.add(Integer.valueOf(0));
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                text2.setVisibility(View.INVISIBLE);

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(s==0)){
                    intent.setClass(getApplicationContext(),SaveActivity.class);
                    intent.putExtra("score",String.valueOf(s));
                    startActivity(intent);
                    finish();
                }
                else {
                    finish();
                }

            }
        });

        text2.setVisibility(View.INVISIBLE);
        k.add(Integer.valueOf(0));

    }

    private void check(){
        Equal(button1.getText().toString(),button2.getText().toString(),button3.getText().toString());
        Equal(button4.getText().toString(),button5.getText().toString(),button6.getText().toString());
        Equal(button7.getText().toString(),button8.getText().toString(),button9.getText().toString());
        Equal(button1.getText().toString(),button4.getText().toString(),button7.getText().toString());
        Equal(button2.getText().toString(),button5.getText().toString(),button8.getText().toString());
        Equal(button3.getText().toString(),button6.getText().toString(),button9.getText().toString());
        Equal(button1.getText().toString(),button5.getText().toString(),button9.getText().toString());
        Equal(button3.getText().toString(),button5.getText().toString(),button7.getText().toString());
    }

    private void Equal(final String str1, final String str2, final String str3){
        if (str1.equals("")||(str2.equals(""))||(str3.equals(""))){
        }
        else if (str1.equals(str2) && str1.equals(str3)){
            n=5;
            if (str1.equals("X")){
                t = -10;
            }
            else if (str1.equals("O")){
                t = 10;
            }
        }
    }

    private void AI(){
        if (b==1){
            button1.setText("O");
        }
        else if (b==2){
            button2.setText("O");
        }
        else if (b==3){
            button3.setText("O");
        }
        else if (b==4){
            button4.setText("O");
        }
        else if (b==5){
            button5.setText("O");
        }
        else if (b==6){
            button6.setText("O");
        }
        else if (b==7){
            button7.setText("O");
        }
        else if (b==8){
            button8.setText("O");
        }
        else if (b==9){
            button9.setText("O");
        }
    }

    private void end(){
        if (n==5){
            if (t==10){
                text2.setText("AI win");
                text2.setVisibility(View.VISIBLE);
            }
            else if (t == -10){
                text2.setText("You win");
                s++;
                text2.setVisibility(View.VISIBLE);
            }
        }
    }

}
