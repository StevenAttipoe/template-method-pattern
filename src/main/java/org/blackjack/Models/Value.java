package org.blackjack.Models;

public enum Value {
    Two(2), Three(3), Four(4), Five(5),
    Six(6), Seven(7), Eight(8), Nine(9),
    Ten(10), Jack(10), Queen(10), King(10), Ace(11);

    private int value;

    Value(int value) {
        if (value < 2 || value > 11) {
            throw new IllegalArgumentException("Card value is either too high or low");
        }

        this.value = value;
    }

    public int getIntegerValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
