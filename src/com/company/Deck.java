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
    private List<Card> deck = new ArrayList<>();

    public Deck() {
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

        List value = new ArrayList();
        value.add(2);
        value.add(3);
        value.add(4);
        value.add(5);
        value.add(6);
        value.add(7);
        value.add(8);
        value.add(9);
        value.add(10);
        value.add(11);
        value.add(11);
        value.add(11);
        value.add(11);

        for (String s : suit) {
            System.out.println(s);
        }
        for (String r : rank) {
            System.out.println(r);
        }
        for (int v : value) {
            System.out.println(v);
        }
    }

}
