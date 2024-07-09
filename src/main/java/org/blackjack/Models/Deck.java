package org.blackjack.Models;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    public Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();

        for (Suit suit: Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }
}
