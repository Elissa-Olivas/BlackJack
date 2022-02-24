package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //In your main class, deal the user a hand of two cards
    //		Display the total of the two card values to the user
    //		If the cards equal 21, declare Black Jack and congratulate the user.
    //		If the cards are not equal to 21, ask the user to hit (get another card) or stay (take the current score and end the “hand)
    //		Allow the user to keep getting cards until their value exceeds 21 or they choose to stay
    //		Bonus: Can you figure out a way to handle Aces being worth 1 or 11?
    //		Super Bonus: Can you handle the dealer also playing a hand to see who wins with the closest score to 21?

    public static void main(String[] args) {
        BlackJackGame letsPlay = new BlackJackGame();


        letsPlay.playBlackJack();


//        Dealer completeDeck = new Dealer();
//        Scanner myScanner = new Scanner(System.in);
//        int userInput = myScanner.nextInt();
//        boolean keepGoing = true;
//        Dealer deal = new Dealer();
//        List<Card> dealTwoCards = new ArrayList<>();

//        completeDeck.deck();
//        completeDeck.printDeck();
//        System.out.println("Lets Play BlackJack! Here are 2 cards to start: ");

        //might need to create a HAND method?
//        do {
//            completeDeck.deal();
//
//            if (dealTwoCards == 21){
//                System.out.println("Congratulations you have Black Jack!");
//            } else if (completeDeck.deal() < 21) {
//                System.out.println("Would you like to hit? Enter 1 for hit and 2 for Stay: ");
//                if (userInput == 1) {
//                    keepGoing = true;
//                } else {
//                    keepGoing = false;
//                }
//            }
//
//        } while (keepGoing);
//    }
    }
}

