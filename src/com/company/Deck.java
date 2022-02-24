package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //Deck should have a public method that “builds” an arraylist of Card objects
//		Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
//		Assigning each card a Rank (2-10, Jack, Queen, King, Ace)
//		Assigning each card a value to 2-11
//		This should be done to recreate the 52 unique cards in a deck
//13 spades- ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
//13 hearts- ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
//13 diamonds- ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
//13 clubs- ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
    private List<Card> completeDeck = new ArrayList<>();

    //    private String suit;
//    private String rank;
//    private int value;
    public List<Card> getCompleteDeck() {
        return completeDeck;
    }

    public void deck() {
        List<String> suit = new ArrayList<>();
        suit.add("Spades");
        suit.add("Heart");
        suit.add("Diamond");
        suit.add("Club");

        List<String> rank = new ArrayList<>();
        rank.add("2");
        rank.add("3");
        rank.add("4");
        rank.add("5");
        rank.add("6");
        rank.add("7");
        rank.add("8");
        rank.add("9");
        rank.add("10");
        rank.add("Jack");
        rank.add("Queen");
        rank.add("King");
        rank.add("Ace");

        List<Integer> value = new ArrayList<>();
        value.add(2);
        value.add(3);
        value.add(4);
        value.add(5);
        value.add(6);
        value.add(7);
        value.add(8);
        value.add(9);
        value.add(10);
        value.add(10);
        value.add(10);
        value.add(10);
        value.add(11);

        //method to build Array named completeDeck
        for (int s = 0; s < suit.size(); s++) {
            for (int r = 0; r < rank.size(); r++) {
                completeDeck.add(new Card(suit.get(s), rank.get(r), value.get(r)));//add suit and rank
            }
        }
    }

    //method to print deck cards to see if completeDeck method is right.
    // within the BuildDeck constructor
    //but outside the loop so it dosent print out each card to the player.
    public void printDeck() {
        for (int n = 0; n < completeDeck.size(); n++) {
            Card myCard = completeDeck.get(n);
            String suit = myCard.getSuit();
            String rank = myCard.getRank();
            int value = myCard.getValue();
            System.out.println("Suit: " + suit + " Rank: " + rank + " Value: " + value);
        }

    }
}


