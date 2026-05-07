package com.pluralsight;
import java.util.ArrayList;

public class Hand {

        //Array list of cards, one hand can hold many cards
    private ArrayList<Card> cards;

    public hand(){
        cards = new ArrayList<>();
    }


   //Constructor
    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    //Card receiver
    public void addCard(Card card){
        cards.add(card);
    }

    //Score method
    public int getValue{
        int total = 0;
        for (Card card : cards){
            total += card.getPointValu();

        }

        return total;
    }

    @Override
    public String toString() {

        String result = "";

        for (Card card : cards) {
            result += card + "\n";
        }

        result += "Total Value: " + getValue();

        return result;
    }
    }
}
