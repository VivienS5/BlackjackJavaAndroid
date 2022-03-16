package com.example.myblackjack.models;

public class Card {
    public String color;
    public String value;
    public int number;

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
        int temp=0;
        int tempColor =0;
        switch (value){
            case "A":
                temp=1;
                break;
            case "V":
                temp=11;
                break;
            case "D":
                temp=12;
                break;
            case "R":
                temp=13;
                break;
            default:
                temp= Integer.parseInt(value);
        }
        switch (color){
            case "Club":
                tempColor=1;
                break;
            case "Spade":
                tempColor=4;
                break;
            case "Hearth":
                tempColor=3;
                break;
            case "Diamond":
                tempColor=2;
                break;
        }
        this.number = temp * 10+tempColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value+" "+color;
    }
}
