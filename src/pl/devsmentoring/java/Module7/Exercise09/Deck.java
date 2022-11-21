package pl.devsmentoring.java.Module7.Exercise09;

import java.util.ArrayList;
import java.util.*;

public class Deck {
    private final ArrayList<Card> deck;
    public Deck(){
        var allSuits = Suit.values();
        var allRanks = Rank.values();
        this.deck = new ArrayList<Card>(allSuits.length * allRanks.length);
        for (var suit : allSuits) {
            for (var rank : allRanks) {
                deck.add(new Card(suit, rank));
            }
        }
    }
    public void shuffle()    //shuffling the deck
    {
        Collections.shuffle(deck);
    }
    public Card drawLast()
    {
        if(this.isEmpty()) return null;
        return deck.remove(51);
    }
    public boolean isEmpty(){
        return deck.isEmpty();
    }

    public int getNoRemainingCars(){
        return deck.size();
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}