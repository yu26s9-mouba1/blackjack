package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompting the user
        System.out.println("Please enter player 1 name: ");
        String player1Name = scanner.nextLine();
        System.out.println("Please enter player 2 name: ");
        String player2Name = scanner.nextLine();

        //Creating player objects
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        // Creating deck
        Deck deck = new Deck();
        deck.shuffle();

        //Handing cards to each player (2 cards each)
        player1.getHand().addCard(deck.deal());
        player2.getHand().addCard(deck.deal());
        player1.getHand().addCard(deck.deal());
        player2.getHand().addCard(deck.deal());

        System.out.println("Welcome " + player1Name + " " + player2Name);

        //Displaying players hands
        System.out.println(player1Name + "' s hand:" );
        System.out.println(player1.getHand());

        System.out.println(player2Name + "' s hand:" );
        System.out.println(player2.getHand());

        







    }








    
}
