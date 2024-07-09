package org.blackjack.Models;

public enum Suit {
    Diamond, Spade, Club, Heart;

    @Override
    public String toString() {
        return this.name();
    }
}
