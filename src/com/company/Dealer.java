package com.company;


//Dealer should have a method named “deal”, that returns two random Cards and removes them from the deck
//		Dealer should have a method named “hit”, that returns a random single card and removes it from the deck


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {
    //method named Deal: returns 2 random Cards and removed them from the Deck

    Random randomCard = new Random(System.currentTimeMillis());

    public void deal() {
        List<Card> dealTwoCards = new ArrayList<Card>();

        //get 2 random cards
        dealTwoCards.add(completeDeck.get[randomCard.nextInt(0)]);
        dealTwoCards.add(completeDeck.get[randomCard.nextInt(1)]);

        //remove these from deck
        completeDeck.remove(0);
        completeDeck.remove(1);
    }

    //method named Hit: returns a random single card and removes it from the deck
    public void hit() {
        completeDeck.get[randomCard.nextInt(0)];
        completeDeck.remove(0);
    }


}

}
