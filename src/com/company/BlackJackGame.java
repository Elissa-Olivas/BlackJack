package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackGame {
    Dealer completedDeck = new Dealer();
    Scanner myScanner = new Scanner(System.in);
    int userInput = myScanner.nextInt();
    boolean keepGoing = true;


    public void playBlackJack() {
        do {
            System.out.println("Lets Play BlackJack! Here are 2 cards to start: ");

            //might need to create a HAND method?

            //this method deals 2 cards and prints out what cards you have
            int x = completedDeck.deal();

            if (x == 21){
                System.out.println("Congratulations you have Black Jack!");
            } else if (x < 21) {
                System.out.println("Would you like to hit? Enter 1 for hit and 2 for Stay: ");
                if (userInput == 1) {
                    keepGoing = true;
                } else {
                    keepGoing = false;
                }
            }

        } while (keepGoing);
//    public String toString() {
//        return (dealTwoCards);
    }
}
