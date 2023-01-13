package pl.devsmentoring.java.Module7.Exercise09;

import java.util.ArrayList;
import java.util.*;

public class Deck {
    private final List<Card> cards;
    public Deck(){
        this.cards = new ArrayList<>();
        for (var suit : Suit.values()) {
            for (var rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    public Card drawLast()
    {
        if(this.cards.isEmpty()) return null;
        return cards.remove(cards.size() - 1);
    }

    public int getNoRemainingCars(){
        return cards.size();
    }

    public Card getRandomCard() {
        return this.cards.get(new Random().nextInt(cards.size()));
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
