package pl.devsmentoring.java.Module7.Exercise09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println("Newly created deck: " + deck);

        deck.shuffle();
        System.out.println("Shuffled deck: " + deck);
        var dealtCard = deck.drawLast();

        System.out.println("Removed card: " + dealtCard);
        System.out.println("The card that was removed from the deck is the: " + dealtCard.getRank() + " of " + dealtCard.getSuit());
        System.out.println("The deck after a card was removed: " + deck);
        System.out.println("Found a random card: " + deck.getRandomCard());
    }
}