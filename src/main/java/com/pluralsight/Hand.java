package com.pluralsight;
import java.util.ArrayList;

public class Hand {

        //Array list of cards, one hand can hold many cards
    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }


    //A card is dealt to the hand and the hand is responsible to store the card
    public void dealCard(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    //Score method
    public int getValue(){
        int value = 0;
        for (Card card : cards){
//            card.flip(); //turn the card over to see the value
            value += card.getPointValue();
//            card.flip(); //hides the card again

        }

        return value;
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
