package com.pluralsight;

public class Card {

    private String suit;
    private String value;
    private boolean isFacedUp;


    public Card(String suit, String value, boolean isFacedUp) {
        this.suit = suit;
        this.value = value;
        this.isFacedUp = isFacedUp;
    }

    public String getSuit() {
        //Only return the suit if the card is face up
        if (isFacedUp){
            return suit;
        } else {
            return "#";
        }

    }

    public String getValue() {
        // Only return the value if the value is face up
        if (isFacedUp){
            return value;

        } else {
            return "#";
        }


    }



    public int getPointValue() {

        // Only return the value if the card is face up
        if (!isFacedUp) {
            return 0;
        }

        if (value.equals("A")) {
            return 11;

        } else if (value.equals("J") || value.equals("Q") || value.equals("K")) {
            return 10;

        } else {
            return Integer.parseInt(value);
        }
    }



        public boolean isFacedUp() {

            return isFacedUp;
        }

        public void flip() {
            isFacedUp = !isFacedUp;
        }

    @Override
    public String toString() {
        return getValue() + " of " + getSuit();
    }










}
