package com.company;


//Dealer should have a method named “deal”, that returns two random Cards and removes them from the deck
//		Dealer should have a method named “hit”, that returns a random single card and removes it from the deck


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dealer {
    //method named Deal: returns 2 random Cards and removed them from the Deck
    Deck completeDeck = new Deck();
    Random randomCard = new Random(System.currentTimeMillis());
    List<Card> completedDeck = new ArrayList<>();

    public Dealer() {
        completeDeck.deck();
        completedDeck = completeDeck.getCompleteDeck();
    }

    public void deal() {
        List<Card> dealTwoCards = new ArrayList<Card>();

        //get 2 random cards
        dealTwoCards.add(completedDeck.get(randomCard.nextInt(0)));
        dealTwoCards.add(completedDeck.get(randomCard.nextInt(1)));

        //remove these from deck
        completedDeck.remove(0);
        completedDeck.remove(1);

//        List<Card> myHand = new ArrayList<>();
//        myHand = dealTwoCards;
        System.out.println("The cards you have in our hand are: " + dealTwoCards);
    }


    //method named Hit: returns a random single card and removes it from the deck
    public void hit() {
        completedDeck.get(randomCard.nextInt(0));
        completedDeck.remove(0);

    }


//        completeDeck.deck();
//        completeDeck.printDeck();

}



