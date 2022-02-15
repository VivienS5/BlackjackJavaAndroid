package com.example.myblackjack;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        int maxcard = 13;
        int mincard = 1;
        int[] card1 = {0};
        int myRandomP = 0;
        int myRandomC = 0;
        int myRandomR = new Random().nextInt((maxcard-mincard)+1)+mincard;

        Button ButtonComm = (Button) findViewById(R.id.buttonCommencer);
        ButtonComm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRandomP = new Random().nextInt((maxcard-mincard)+1)+mincard;
                int myRandomC = new Random().nextInt((maxcard-mincard)+1)+mincard;
                TextView textValueCroup = (TextView)findViewById(R.id.textValueCroup);
                TextView textValuePlayer = (TextView)findViewById(R.id.textValuePlayer);
                textValueCroup.setText(String.valueOf(myRandomC));
                textValuePlayer.setText(String.valueOf(myRandomP));


        Button ButtonAdd = (Button) findViewById(R.id.buttonDraw);
        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*TextView textValuePlayer = (TextView)findViewById(R.id.textValuePlayer);
                textValuePlayer.setText(textValuePlayer.getText() + String.valueOf(new Random().nextInt((maxcard-mincard)+1)+mincard));
                */
                TextView textValuePlayer = (TextView)findViewById(R.id.textValuePlayer);
                int res = Integer.parseInt(String.valueOf(myRandomP)) + Integer.parseInt(String.valueOf(new Random().nextInt((maxcard-mincard)+1)+mincard));

                textValuePlayer.setText(+res);


            }
        });

        }
    });

}










    













}