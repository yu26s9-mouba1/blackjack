package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {

    /**
     * An arrayList of cards
     */
    private ArrayList<Card> cards;


    /**
     * A class containing of elements of the arraylist (suits and values)
     */
    public Deck(){
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};


        /**
         *Creating all the cards in the deck and adding them to the arraylist
        */

        for (String suit: suits){
            for (String value: values){
                Card card = new Card(suit, value, true);
                cards.add(card);

            }
        }

    }


    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card deal(){
        //deal the top card (if there are many cards left)
        if (cards.size() > 0){
            Card card = cards.remove(0);
            return card;
        }else {
            return null;
        }
    }

    public int getSize(){
        return cards.size();
    }




}
