package org.blackjack;

import org.blackjack.Models.Game;

public class Main {
    public static void main(String[] args) {
        var game = new Game();
        game.startGame();

        while (!game.getGameState().isComplete()) {
            game.simulateRound();
        }
    }
}