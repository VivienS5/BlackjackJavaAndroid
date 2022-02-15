package com.example.myblackjack;

import static com.example.myblackjack.R.id.buttonP10;
import static com.example.myblackjack.R.id.text;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<buttonReset> extends AppCompatActivity implements View.OnClickListener {


    Button buttonP10, buttonP20,buttonP30,buttonP50, buttonP100, buttonX2, buttonDiv2, buttonReset;
    TextView textBet;
    Calculate model= new Calculate();




        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(this);

        textBet= (TextView) findViewById(R.id.textBet);

        Button buttonP10 = (Button) findViewById(R.id.buttonP10);
        buttonP10.setOnClickListener(this);
        Button buttonP20 = (Button) findViewById(R.id.buttonP20);
        buttonP20.setOnClickListener(this);
        Button buttonP30 = (Button) findViewById(R.id.buttonP30);
        buttonP30.setOnClickListener(this);
        Button buttonP50 = (Button) findViewById(R.id.buttonP50);
        buttonP50.setOnClickListener(this);
        Button buttonP100 = (Button) findViewById(R.id.buttonP100);
        buttonP100.setOnClickListener(this);
        Button buttonX2 = (Button) findViewById(R.id.buttonX2);
        buttonX2.setOnClickListener(this);
        Button buttonDiv2 = (Button) findViewById(R.id.buttonDiv2);
        buttonDiv2.setOnClickListener(this);
        Button buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.buttonStart:


                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);

                break;
            }
        }



}