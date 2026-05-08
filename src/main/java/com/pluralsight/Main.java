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
        for (int i = 0; i < 2; i++) {
            player1.getHand().dealCard(deck.deal());
            player2.getHand().dealCard(deck.deal());
        }

        System.out.println("Welcome " + player1Name + "and " + player2Name);

        //Displaying players hands
        System.out.println(player1Name +"'s hand:");
        System.out.println(player1.getHand());

        System.out.println(player2Name +"'s hand:");
        System.out.println(player2.getHand());

        //Score variables
        int player1Total = player1.getHand().getValue();
        int player2Total = player2.getHand().getValue();


        //Winner Logic

        if (player1Total > 21 && player2Total > 21) {
            System.out.println("Both players busted!");
        } else if (player1Total > 21) {
            System.out.println(player2Name + " wins!");
        } else if (player2Total > 21) {
            System.out.println(player1Name + " wins!");
        } else if (player1Total > player2Total) {
            System.out.println(player1Name + " wins!");
        } else if (player2Total > player1Total) {
            System.out.println(player2Name + " wins!");
        } else {
            System.out.println("It's a tie!");
        }








    }








    
}
