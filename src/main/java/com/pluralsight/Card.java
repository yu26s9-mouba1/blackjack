package com.pluralsight;

public class Card {

    private String suit;
    private String value;


    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }




    public void getPointValue(){

        //Ace
        if (value.equals("A")){
            return 11;

            //Facecards
        } else if (value.equals("j") || value.equals "Q" || value.equals "K") {
            return 10;

            //Number cards 2-10

        }else{
            return integer.parseInt(value);
        }




    }




}
