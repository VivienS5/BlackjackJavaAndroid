package com.example.myblackjack;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myblackjack.models.Card;
import com.example.myblackjack.models.Deck;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView CarteJ1, CarteJ2, CarteJ3, CarteJ4, CarteJ5, CarteC1, CarteC2, CarteC3, CarteC4, CarteC5;
    Button ButtonComm, ButtonReComm, ButtonStay, ButtonAdd, ButtonX2;
    TextView textValueCroup, textValuePlayer, textBet, textMoney;
    int card_value_p = 0;
    int card_value_c = 0;

    ArrayList<Card> cards;
    Deck mydeck;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ButtonComm = (Button) findViewById(R.id.buttonCommencer);
        ButtonComm.setOnClickListener(this);
        ButtonReComm = (Button) findViewById(R.id.buttonRecommencer);
        ButtonReComm.setOnClickListener(this);
        ButtonAdd = (Button) findViewById(R.id.buttonDraw);
        ButtonAdd.setOnClickListener(this);
        ButtonStay = (Button) findViewById(R.id.buttonStay);
        ButtonStay.setOnClickListener(this);
        ButtonX2 = (Button) findViewById(R.id.buttonX2);
        ButtonX2.setOnClickListener(this);
        textMoney = (TextView) findViewById(R.id.textMoney);
        textValuePlayer= (TextView) findViewById(R.id.textValuePlayer);
        textBet= (TextView) findViewById(R.id.textBet);
        textValueCroup= (TextView) findViewById(R.id.textValueCroup);
        CarteC1= (ImageView) findViewById(R.id.imageCroup);
        CarteC2= (ImageView) findViewById(R.id.imageCroup2);
        CarteC3= (ImageView) findViewById(R.id.imageCroup3);
        CarteC4= (ImageView) findViewById(R.id.imageCroup4);
        CarteC5= (ImageView) findViewById(R.id.imageCroup5);
        CarteJ1= (ImageView) findViewById(R.id.imagePlayer1);
        CarteJ2= (ImageView) findViewById(R.id.imagePlayer2);
        CarteJ3= (ImageView) findViewById(R.id.imagePlayer3);
        CarteJ4= (ImageView) findViewById(R.id.imagePlayer4);
        CarteJ5= (ImageView) findViewById(R.id.imagePlayer5);

        textValuePlayer.setVisibility(View.INVISIBLE);
        textValueCroup.setVisibility(View.INVISIBLE);
        textBet.setVisibility(View.INVISIBLE);
        ButtonReComm.setVisibility(View.INVISIBLE);
        ButtonX2.setVisibility(View.INVISIBLE);
        ButtonAdd.setVisibility(View.INVISIBLE);
        ButtonStay.setVisibility(View.INVISIBLE);
        CarteJ1.setVisibility(View.INVISIBLE);
        CarteJ2.setVisibility(View.INVISIBLE);
        CarteJ3.setVisibility(View.INVISIBLE);
        CarteJ4.setVisibility(View.INVISIBLE);
        CarteJ5.setVisibility(View.INVISIBLE);
        CarteC1.setVisibility(View.INVISIBLE);
        CarteC2.setVisibility(View.INVISIBLE);
        CarteC3.setVisibility(View.INVISIBLE);
        CarteC4.setVisibility(View.INVISIBLE);
        CarteC5.setVisibility(View.INVISIBLE);

        mydeck = new Deck();
        mydeck.shuffle();

    }

    public void assignImages(int numCarte, ImageView image){
        switch(numCarte){
            case 11:
                image.setImageResource(R.drawable.c11);
                card_value_p = card_value_p + 1;
                card_value_c = card_value_c + 1;
                break;
            case 12:
                image.setImageResource(R.drawable.c12);
                card_value_p = card_value_p + 1;
                card_value_c = card_value_c + 1;
                break;
            case 13:
                image.setImageResource(R.drawable.c13);
                card_value_p = card_value_p + 1;
                card_value_c = card_value_c + 1;
                break;
            case 14:
                image.setImageResource(R.drawable.c14);
                card_value_p = card_value_p + 1;
                card_value_c = card_value_c + 1;
                break;
            case 21:
                image.setImageResource(R.drawable.c21);
                card_value_p = card_value_p + 2;
                card_value_c = card_value_c + 2;
                break;
            case 22:
                image.setImageResource(R.drawable.c22);
                card_value_p = card_value_p + 2;
                card_value_c = card_value_c + 2;
                break;
            case 23:
                image.setImageResource(R.drawable.c23);
                card_value_p = card_value_p + 2;
                card_value_c = card_value_c + 2;
                break;
            case 24:
                image.setImageResource(R.drawable.c24);
                card_value_p = card_value_p + 2;
                card_value_c = card_value_c + 2;
                break;
            case 31:
                image.setImageResource(R.drawable.c31);
                card_value_p = card_value_p + 3;
                card_value_c = card_value_c + 3;
                break;
            case 32:
                image.setImageResource(R.drawable.c32);
                card_value_p = card_value_p + 3;
                card_value_c = card_value_c + 3;
                break;
            case 33:
                image.setImageResource(R.drawable.c33);
                card_value_p = card_value_p + 3;
                card_value_c = card_value_c + 3;
                break;
            case 34:
                image.setImageResource(R.drawable.c34);
                card_value_p = card_value_p + 3;
                card_value_c = card_value_c + 3;
                break;
            case 41:
                image.setImageResource(R.drawable.c41);
                card_value_p = card_value_p + 4;
                card_value_c = card_value_c + 4;
                break;
            case 42:
                image.setImageResource(R.drawable.c42);
                card_value_p = card_value_p + 4;
                card_value_c = card_value_c + 4;
                break;
            case 43:
                image.setImageResource(R.drawable.c43);
                card_value_p = card_value_p + 4;
                card_value_c = card_value_c + 4;
                break;
            case 44:
                image.setImageResource(R.drawable.c44);
                card_value_p = card_value_p + 4;
                card_value_c = card_value_c + 4;
                break;
            case 51:
                image.setImageResource(R.drawable.c51);
                card_value_p = card_value_p + 5;
                card_value_c = card_value_c + 5;
                break;
            case 52:
                image.setImageResource(R.drawable.c52);
                card_value_p = card_value_p + 5;
                card_value_c = card_value_c + 5;
                break;
            case 53:
                image.setImageResource(R.drawable.c53);
                card_value_p = card_value_p + 5;
                card_value_c = card_value_c + 5;
                break;
            case 54:
                image.setImageResource(R.drawable.c54);
                card_value_p = card_value_p + 5;
                card_value_c = card_value_c + 5;
                break;
            case 61:
                image.setImageResource(R.drawable.c61);
                card_value_p = card_value_p + 6;
                card_value_c = card_value_c + 6;
                break;
            case 62:
                image.setImageResource(R.drawable.c62);
                card_value_p = card_value_p + 6;
                card_value_c = card_value_c + 6;
                break;
            case 63:
                image.setImageResource(R.drawable.c63);
                card_value_p = card_value_p + 6;
                card_value_c = card_value_c + 6;
                break;
            case 64:
                image.setImageResource(R.drawable.c64);
                card_value_p = card_value_p + 6;
                card_value_c = card_value_c + 6;
                break;
            case 71:
                image.setImageResource(R.drawable.c71);
                card_value_p = card_value_p + 7;
                card_value_c = card_value_c + 7;
                break;
            case 72:
                image.setImageResource(R.drawable.c72);
                card_value_p = card_value_p + 7;
                card_value_c = card_value_c + 7;
                break;
            case 73:
                image.setImageResource(R.drawable.c73);
                card_value_p = card_value_p + 7;
                card_value_c = card_value_c + 7;
                break;
            case 74:
                image.setImageResource(R.drawable.c74);
                card_value_p = card_value_p + 7;
                card_value_c = card_value_c + 7;
                break;
            case 81:
                image.setImageResource(R.drawable.c81);
                card_value_p = card_value_p + 8;
                card_value_c = card_value_c + 8;
                break;
            case 82:
                image.setImageResource(R.drawable.c82);
                card_value_p = card_value_p + 8;
                card_value_c = card_value_c + 8;
                break;
            case 83:
                image.setImageResource(R.drawable.c83);
                card_value_p = card_value_p + 8;
                card_value_c = card_value_c + 8;
                break;
            case 84:
                image.setImageResource(R.drawable.c84);
                card_value_p = card_value_p + 8;
                card_value_c = card_value_c + 8;
                break;
            case 91:
                image.setImageResource(R.drawable.c91);
                card_value_p = card_value_p + 9;
                card_value_c = card_value_c + 9;
                break;
            case 92:
                image.setImageResource(R.drawable.c92);
                card_value_p = card_value_p + 9;
                card_value_c = card_value_c + 9;
                break;
            case 93:
                image.setImageResource(R.drawable.c93);
                card_value_p = card_value_p + 9;
                card_value_c = card_value_c + 9;
                break;
            case 94:
                image.setImageResource(R.drawable.c94);
                card_value_p = card_value_p + 9;
                card_value_c = card_value_c + 9;
                break;
            case 101:
                image.setImageResource(R.drawable.c101);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 102:
                image.setImageResource(R.drawable.c102);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 103:
                image.setImageResource(R.drawable.c103);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 104:
                image.setImageResource(R.drawable.c104);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 111:
                image.setImageResource(R.drawable.c111);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 112:
                image.setImageResource(R.drawable.c112);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 113:
                image.setImageResource(R.drawable.c113);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 114:
                image.setImageResource(R.drawable.c114);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 121:
                image.setImageResource(R.drawable.c121);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 122:
                image.setImageResource(R.drawable.c122);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 123:
                image.setImageResource(R.drawable.c123);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 124:
                image.setImageResource(R.drawable.c124);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 131:
                image.setImageResource(R.drawable.c131);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 132:
                image.setImageResource(R.drawable.c132);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 133:
                image.setImageResource(R.drawable.c133);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
            case 134:
                image.setImageResource(R.drawable.c134);
                card_value_p = card_value_p + 10;
                card_value_c = card_value_c + 10;
                break;
        }
    }


    @Override
    public void onClick(View view) {
        Button button= (Button) view;
        if(button.equals(ButtonComm)){
            startGame();
        }
        if(button.equals(ButtonReComm)){
            onClickRecomm();
        }
        if(button.equals(ButtonAdd)){
            onClickAdd();
        }
        if(button.equals(ButtonStay)){
            onClickStay();
        }
        if(button.equals(ButtonX2)){
            onClickTest();
        }

    }

    public void startGame() {
        ButtonComm.setVisibility(View.INVISIBLE);
        ButtonX2.setVisibility(View.VISIBLE);
        ButtonAdd.setVisibility(View.VISIBLE);
        ButtonStay.setVisibility(View.VISIBLE);
        textValuePlayer.setVisibility(View.VISIBLE);
        textValueCroup.setVisibility(View.VISIBLE);
        textBet.setVisibility(View.VISIBLE);
            textBet.setText("Faites un choix !");
        CarteJ1.setVisibility(View.VISIBLE);
        CarteC1.setVisibility(View.VISIBLE);
        Card c1 = mydeck.draw();
        assignImages(c1.number, CarteJ1);
        textValuePlayer.setText(card_value_p+"");
        card_value_c = card_value_c - card_value_p;
        Card c6 = mydeck.draw();
        assignImages(c6.number, CarteC1);
        textValueCroup.setText(card_value_c+"");
    }

    public void onClickAdd(){
        //note
// penser à la lois charlie (si 5 cartes dans la main d'un joueur alors il gagne automatiquement)
        if (CarteJ4.getVisibility() == View.VISIBLE) {
            CarteJ5.setVisibility(View.VISIBLE);
            Card c5 = mydeck.draw();
            assignImages(c5.number, CarteJ5);
            textValuePlayer.setText(card_value_p +"");
        }else if (CarteJ3.getVisibility() == View.VISIBLE) {
            CarteJ4.setVisibility(View.VISIBLE);
            Card c4 = mydeck.draw();
            assignImages(c4.number, CarteJ4);
            textValuePlayer.setText(card_value_p +"");
        }else if (CarteJ2.getVisibility() == View.VISIBLE) {
            CarteJ3.setVisibility(View.VISIBLE);
            Card c3 = mydeck.draw();
            assignImages(c3.number, CarteJ3);
            textValuePlayer.setText(card_value_p + "");
        }else if (CarteJ1.getVisibility() == View.VISIBLE){
            CarteJ2.setVisibility(View.VISIBLE);
            card_value_p = card_value_p - card_value_c;
            Card c2 = mydeck.draw();
            assignImages(c2.number, CarteJ2);
            textValuePlayer.setText(card_value_p +"");
        }

        if (card_value_p > 21 ){
            textBet.setText("Bust");
            ButtonComm.setVisibility(View.INVISIBLE);
            ButtonReComm.setVisibility(View.VISIBLE);
            ButtonX2.setVisibility(View.INVISIBLE);
            ButtonAdd.setVisibility(View.INVISIBLE);
            ButtonStay.setVisibility(View.INVISIBLE);
            
            /*Card c2 = mydeck.draw();
            Card c3 = mydeck.draw();
            Card c4 = mydeck.draw();
            Card c5 = mydeck.draw();*/

            CarteC2.setVisibility(View.VISIBLE);
            Card c7 = mydeck.draw();
            assignImages(c7.number, CarteC2);
            textValueCroup.setText(card_value_c + "");

            //textMoney.setText(c2.number   + "");

            /*if (c7.number / 10 > 10) {
                card_value_c = card_value_c - 10;
                textValueCroup.setText(card_value_c + "");
            }else {
                card_value_c = card_value_c - c7.number / 10;
                textValueCroup.setText(card_value_c + "");
            }*/


            /*int cartej1_r = Integer.valueOf(textMoney.getText().toString());
            card_value_c = card_value_c - (card_value_c_r + cartej1_r) ;

            textValueCroup.setText(cartej1_r + "");*/

            // il faut soustraire les Cartj2,3,4,5 à card_value_c pour avoir la bonne valeur

        }else{
            textBet.setText("Faites un choix !");
        }
        if (card_value_p == 21){
            if(card_value_c <= 17 ){
                CarteC2.setVisibility(View.VISIBLE);
                Card c2 = mydeck.draw();
                assignImages(c2.number, CarteJ2);
                if (card_value_c <= 17){
                    Card c3 = mydeck.draw();
                    assignImages(c3.number, CarteJ3);
                    CarteC3.setVisibility(View.VISIBLE);
                    if (card_value_c <= 17){
                        Card c4 = mydeck.draw();
                        assignImages(c4.number, CarteJ4);
                        CarteC4.setVisibility(View.VISIBLE);
                        if (card_value_c <= 17){
                            Card c5 = mydeck.draw();
                            assignImages(c5.number, CarteJ5);
                            CarteC5.setVisibility(View.VISIBLE);
                        }
                    }
                }
                textValueCroup.setText(card_value_c +"");
            }
            textBet.setText("BlackJack !");
            textValueCroup.setText(card_value_c + "");
            ButtonComm.setVisibility(View.INVISIBLE);
            ButtonReComm.setVisibility(View.VISIBLE);
            ButtonX2.setVisibility(View.INVISIBLE);
            ButtonAdd.setVisibility(View.INVISIBLE);
            ButtonStay.setVisibility(View.INVISIBLE);
        }else if (card_value_p == 21 && card_value_c == 21){
            textBet.setText("Egalité");
            ButtonComm.setVisibility(View.INVISIBLE);
            ButtonReComm.setVisibility(View.VISIBLE);
            ButtonX2.setVisibility(View.INVISIBLE);
            ButtonAdd.setVisibility(View.INVISIBLE);
            ButtonStay.setVisibility(View.INVISIBLE);}
        if (card_value_p == 17 && card_value_c == 17){
            textBet.setText("Egalité");
            ButtonComm.setVisibility(View.INVISIBLE);
            ButtonReComm.setVisibility(View.VISIBLE);
            ButtonX2.setVisibility(View.INVISIBLE);
            ButtonAdd.setVisibility(View.INVISIBLE);
            ButtonStay.setVisibility(View.INVISIBLE);}
            if (card_value_p == 18 && card_value_c == 18){
                textBet.setText("Egalité");
                ButtonComm.setVisibility(View.INVISIBLE);
                ButtonReComm.setVisibility(View.VISIBLE);
                ButtonX2.setVisibility(View.INVISIBLE);
                ButtonAdd.setVisibility(View.INVISIBLE);
                ButtonStay.setVisibility(View.INVISIBLE);}
                if (card_value_p == 19 && card_value_c == 19){
                    textBet.setText("Egalité");
                    ButtonComm.setVisibility(View.INVISIBLE);
                    ButtonReComm.setVisibility(View.VISIBLE);
                    ButtonX2.setVisibility(View.INVISIBLE);
                    ButtonAdd.setVisibility(View.INVISIBLE);
                    ButtonStay.setVisibility(View.INVISIBLE);}
                    if (card_value_p == 20 && card_value_c == 20){
                        textBet.setText("Egalité");
                        ButtonComm.setVisibility(View.INVISIBLE);
                        ButtonReComm.setVisibility(View.VISIBLE);
                        ButtonX2.setVisibility(View.INVISIBLE);
                        ButtonAdd.setVisibility(View.INVISIBLE);
                        ButtonStay.setVisibility(View.INVISIBLE);}


        }

    public void onClickStay(){
        ButtonComm.setVisibility(View.INVISIBLE);
        ButtonX2.setVisibility(View.INVISIBLE);
        ButtonAdd.setVisibility(View.INVISIBLE);
        ButtonStay.setVisibility(View.INVISIBLE);
        ButtonReComm.setVisibility(View.VISIBLE);

        CarteC2.setVisibility(View.VISIBLE);

            if (card_value_c <= 16) {
                CarteC2.setVisibility(View.VISIBLE);
                Card c2 = mydeck.draw();
                assignImages(c2.number, CarteC2);
                textValueCroup.setText(card_value_c + "");
            }
            if (card_value_c <= 16 && CarteC2.getVisibility() == View.VISIBLE) {
                CarteC3.setVisibility(View.VISIBLE);
                Card c3 = mydeck.draw();
                assignImages(c3.number, CarteC3);
                textValueCroup.setText(card_value_c + "");
            }
            if (card_value_c <= 16 && CarteC3.getVisibility() == View.VISIBLE) {
                CarteC4.setVisibility(View.VISIBLE);
                Card c4 = mydeck.draw();
                assignImages(c4.number, CarteC4);
                textValueCroup.setText(card_value_c + "");
            }
            if (card_value_c <= 16 && CarteC4.getVisibility() == View.VISIBLE) {
                CarteC5.setVisibility(View.VISIBLE);
                Card c5 = mydeck.draw();
                assignImages(c5.number, CarteC5);
                textValueCroup.setText(card_value_c + "");
            }



        if (card_value_c <=21 && card_value_c >=17){
            if (card_value_c > card_value_p){
                textBet.setText("Croupier win");
            }
            if (card_value_c == card_value_p){
                textBet.setText("Egalité");
            }
            if (card_value_c < card_value_p){
                textBet.setText("Player win");
            }
        }

        if (card_value_c >= 22 && card_value_p<= 21){
            textBet.setText("Player win");
        }else{
            textBet.setText("Croupier win");
        }
        }

    public void onClickRecomm(){
        card_value_c = 0;
        card_value_p = 0;
        textValueCroup.setText("");
        textValuePlayer.setText("");
        textBet.setText("Faites un choix !");
        ButtonReComm.setVisibility(View.INVISIBLE);
        ButtonX2.setVisibility(View.VISIBLE);
        ButtonAdd.setVisibility(View.VISIBLE);
        ButtonStay.setVisibility(View.VISIBLE);

        CarteJ2.setVisibility(View.INVISIBLE);
        CarteJ3.setVisibility(View.INVISIBLE);
        CarteJ4.setVisibility(View.INVISIBLE);
        CarteJ5.setVisibility(View.INVISIBLE);

        CarteC2.setVisibility(View.INVISIBLE);
        CarteC3.setVisibility(View.INVISIBLE);
        CarteC4.setVisibility(View.INVISIBLE);
        CarteC5.setVisibility(View.INVISIBLE);
            textBet.setText("Faites un choix !");
        CarteJ1.setVisibility(View.VISIBLE);
        CarteC1.setVisibility(View.VISIBLE);
        Card c1 = mydeck.draw();
        assignImages(c1.number, CarteJ1);
        textValuePlayer.setText(card_value_p+"");
        card_value_c = card_value_c - card_value_p;
        Card c6 = mydeck.draw();
        assignImages(c6.number, CarteC1);
        textValueCroup.setText(card_value_c+"");

    }

    public void onClickTest(){
        Card c = mydeck.draw();
        assignImages(c.number, CarteC1);
        CarteC1.setVisibility(View.VISIBLE);
    }
}