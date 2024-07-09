package org.blackjack.Models;

import org.example.Interface.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards;
    private String id;
    private final Strategy strategy;

    public Player(String id, Strategy strategy){
        cards = new ArrayList<>();
        this.id  = id;
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public int getTotal(){
        return cards.stream()
                .map(c -> c.getValue().getIntegerValue())
                .reduce(0, Integer::sum);
    }

    @Override
    public String toString() {
        return String.format("Player %s - %s", id, getTotal());
    }
}
