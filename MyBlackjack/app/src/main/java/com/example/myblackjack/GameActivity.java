package com.example.myblackjack;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

class CardPlayer {
    int cardP;
    int cardC;

    CardPlayer(int cardP, int cardC) {
        this.cardP = cardP;
        this.cardC = cardC;
    }
}

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView CarteJ1, CarteJ2, CarteJ3, CarteC;
    Button ButtonComm, ButtonStay, ButtonAdd, ButtonX2;
    TextView textValueCroup, textValuePlayer, textBet;
    int maxcard = 13;
    int mincard = 1;

    ArrayList<Integer> cartes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ButtonComm = (Button) findViewById(R.id.buttonCommencer);
        ButtonComm.setOnClickListener(this);
        ButtonAdd = (Button) findViewById(R.id.buttonDraw);
        ButtonAdd.setOnClickListener(this);
        ButtonStay = (Button) findViewById(R.id.buttonStay);
        ButtonStay.setOnClickListener(this);
        ButtonX2 = (Button) findViewById(R.id.buttonX2);
        ButtonX2.setOnClickListener(this);
        textValuePlayer= (TextView) findViewById(R.id.textValuePlayer);
        textBet= (TextView) findViewById(R.id.textBet);
        textValueCroup= (TextView) findViewById(R.id.textValueCroup);
        CarteC= (ImageView) findViewById(R.id.imageCroup);
        CarteJ1= (ImageView) findViewById(R.id.imagePlayer1);
        CarteJ2= (ImageView) findViewById(R.id.imagePlayer2);
        CarteJ3= (ImageView) findViewById(R.id.imagePlayer3);

        ButtonX2.setVisibility(View.INVISIBLE);
        ButtonAdd.setVisibility(View.INVISIBLE);
        ButtonStay.setVisibility(View.INVISIBLE);
        CarteJ1.setVisibility(View.INVISIBLE);
        CarteJ2.setVisibility(View.INVISIBLE);
        CarteJ3.setVisibility(View.INVISIBLE);
        CarteC.setVisibility(View.INVISIBLE);

        cartes = new ArrayList<>();

        cartes.add(11);
        cartes.add(12);
        cartes.add(13);
        cartes.add(14);
        cartes.add(21);
        cartes.add(22);
        cartes.add(23);
        cartes.add(24);
        cartes.add(31);
        cartes.add(32);
        cartes.add(33);
        cartes.add(34);
        cartes.add(41);
        cartes.add(42);
        cartes.add(43);
        cartes.add(44);
        cartes.add(51);
        cartes.add(52);
        cartes.add(53);
        cartes.add(54);
        cartes.add(61);
        cartes.add(62);
        cartes.add(63);
        cartes.add(64);
        cartes.add(71);
        cartes.add(72);
        cartes.add(73);
        cartes.add(74);
        cartes.add(81);
        cartes.add(82);
        cartes.add(83);
        cartes.add(84);
        cartes.add(91);
        cartes.add(92);
        cartes.add(93);
        cartes.add(94);
        cartes.add(101);
        cartes.add(102);
        cartes.add(103);
        cartes.add(104);
        cartes.add(111);
        cartes.add(112);
        cartes.add(113);
        cartes.add(114);
        cartes.add(121);
        cartes.add(122);
        cartes.add(123);
        cartes.add(124);
        cartes.add(131);
        cartes.add(132);
        cartes.add(133);
        cartes.add(134);

    }

    public void assignImages(int cartes, ImageView image){
        switch(cartes){
            case 11:
                image.setImageResource(R.drawable.c11);
                break;
            case 12:
                image.setImageResource(R.drawable.c12);
                break;
            case 13:
                image.setImageResource(R.drawable.c13);
                break;
            case 14:
                image.setImageResource(R.drawable.c14);
                break;
            case 21:
                image.setImageResource(R.drawable.c21);
                break;
            case 22:
                image.setImageResource(R.drawable.c22);
                break;
            case 23:
                image.setImageResource(R.drawable.c23);
                break;
            case 24:
                image.setImageResource(R.drawable.c24);
                break;
            case 31:
                image.setImageResource(R.drawable.c31);
                break;
            case 32:
                image.setImageResource(R.drawable.c32);
                break;
            case 33:
                image.setImageResource(R.drawable.c33);
                break;
            case 34:
                image.setImageResource(R.drawable.c34);
                break;
            case 41:
                image.setImageResource(R.drawable.c41);
                break;
            case 42:
                image.setImageResource(R.drawable.c42);
                break;
            case 43:
                image.setImageResource(R.drawable.c43);
                break;
            case 44:
                image.setImageResource(R.drawable.c44);
                break;
            case 51:
                image.setImageResource(R.drawable.c51);
                break;
            case 52:
                image.setImageResource(R.drawable.c52);
                break;
            case 53:
                image.setImageResource(R.drawable.c53);
                break;
            case 54:
                image.setImageResource(R.drawable.c54);
                break;
            case 61:
                image.setImageResource(R.drawable.c61);
                break;
            case 62:
                image.setImageResource(R.drawable.c62);
                break;
            case 63:
                image.setImageResource(R.drawable.c63);
                break;
            case 64:
                image.setImageResource(R.drawable.c64);
                break;
            case 71:
                image.setImageResource(R.drawable.c71);
                break;
            case 72:
                image.setImageResource(R.drawable.c72);
                break;
            case 73:
                image.setImageResource(R.drawable.c73);
                break;
            case 74:
                image.setImageResource(R.drawable.c74);
                break;
            case 81:
                image.setImageResource(R.drawable.c81);
                break;
            case 82:
                image.setImageResource(R.drawable.c82);
                break;
            case 83:
                image.setImageResource(R.drawable.c83);
                break;
            case 84:
                image.setImageResource(R.drawable.c84);
                break;
            case 91:
                image.setImageResource(R.drawable.c91);
                break;
            case 92:
                image.setImageResource(R.drawable.c92);
                break;
            case 93:
                image.setImageResource(R.drawable.c93);
                break;
            case 94:
                image.setImageResource(R.drawable.c94);
                break;
            case 101:
                image.setImageResource(R.drawable.c101);
                break;
            case 102:
                image.setImageResource(R.drawable.c102);
                break;
            case 103:
                image.setImageResource(R.drawable.c103);
                break;
            case 104:
                image.setImageResource(R.drawable.c104);
                break;
            case 111:
                image.setImageResource(R.drawable.c111);
                break;
            case 112:
                image.setImageResource(R.drawable.c112);
                break;
            case 113:
                image.setImageResource(R.drawable.c113);
                break;
            case 114:
                image.setImageResource(R.drawable.c114);
                break;
            case 121:
                image.setImageResource(R.drawable.c121);
                break;
            case 122:
                image.setImageResource(R.drawable.c122);
                break;
            case 123:
                image.setImageResource(R.drawable.c123);
                break;
            case 124:
                image.setImageResource(R.drawable.c124);
                break;
            case 131:
                image.setImageResource(R.drawable.c131);
                break;
            case 132:
                image.setImageResource(R.drawable.c132);
                break;
            case 133:
                image.setImageResource(R.drawable.c133);
                break;
            case 134:
                image.setImageResource(R.drawable.c134);
                break;
        }
    }


    @Override
    public void onClick(View view) {
        Button button= (Button) view;
        if(button.equals(ButtonComm)){
            startGame();
        }
        if(button.equals(ButtonAdd)){
            onClickAdd();
        }
        if(button.equals(ButtonStay)){
            onClickStay();
        }

    }

    public void startGame() {
        ButtonComm.setVisibility(View.VISIBLE);
        ButtonX2.setVisibility(View.VISIBLE);
        ButtonAdd.setVisibility(View.VISIBLE);
        ButtonStay.setVisibility(View.VISIBLE);
        textBet.setText("Faites un choix !");

        Collections.shuffle(cartes);
        assignImages(cartes.get(0), CarteJ1);
        assignImages(cartes.get(1), CarteJ2);
        assignImages(cartes.get(2), CarteJ3);
        assignImages(cartes.get(3), CarteC);
        CarteJ1.setVisibility(View.VISIBLE);
        CarteJ2.setVisibility(View.VISIBLE);
        CarteJ3.setVisibility(View.VISIBLE);
        CarteC.setVisibility(View.VISIBLE);

        // affecter une valeur sur les case/cartes pour pouvoir les additionées

        /*CardPlayer gc = new CardPlayer(0, 0);

        gc.cardP = new Random().nextInt((maxcard - mincard) + 1) + mincard;
        textValuePlayer.setText(gc.cardP+"");

        gc.cardC = new Random().nextInt((maxcard - mincard) + 1) + mincard;
        textValueCroup.setText(gc.cardC+"");*/
        //int cartes.case(11):gc.cardC;
        textValuePlayer.setText(CarteJ1+"");
        textValueCroup.setText(CarteC+"");

    }

    public void onClickAdd(){
        Integer valueC= Integer.parseInt(textValueCroup.getText().toString());
        Integer value= Integer.parseInt(textValuePlayer.getText().toString());
        value = value + new Random().nextInt((maxcard-mincard)+1)+mincard;
        textValuePlayer.setText(value+"");


        if (value > 21 ){
            textBet.setText("Bust");
            while(valueC < 17 ){
                valueC = valueC + new Random().nextInt((maxcard - mincard) + 1) + mincard;
                textValueCroup.setText(valueC + "");
                ButtonComm.setVisibility(View.VISIBLE);
                ButtonX2.setVisibility(View.INVISIBLE);
                ButtonAdd.setVisibility(View.INVISIBLE);
                ButtonStay.setVisibility(View.INVISIBLE);
            }
        }else{
            textBet.setText("Faites un choix !");
        }if (value == 21){
            textBet.setText("BlackJack !");
            valueC = valueC + new Random().nextInt((maxcard - mincard) + 1) + mincard;
            textValueCroup.setText(valueC + "");
        }
        if (value == 21 && valueC == 21){
            textBet.setText("Egalité");
        }
    }



    public void onClickStay(){
        ButtonComm.setVisibility(View.VISIBLE);
        ButtonX2.setVisibility(View.INVISIBLE);
        ButtonAdd.setVisibility(View.INVISIBLE);
        ButtonStay.setVisibility(View.INVISIBLE);
        ButtonComm.setText("Recommencez !");

        Integer valueC= Integer.parseInt(textValueCroup.getText().toString());
        Integer value= Integer.parseInt(textValuePlayer.getText().toString());

        while(valueC < 17 ){
            valueC = valueC + new Random().nextInt((maxcard - mincard) + 1) + mincard;
            textValueCroup.setText(valueC + "");
        }

        if (valueC <=21 && valueC >=17){
            if (valueC > value){
                textBet.setText("Croupier win");
            }else{
                textBet.setText("Player win");
            }
        }
        if (valueC >= 22 ){
            textBet.setText("Player win");
        }
    }
}