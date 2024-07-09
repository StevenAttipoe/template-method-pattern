package org.blackjack.Interface;

import org.example.Models.Deck;
import org.example.Models.GameState;
import org.example.Models.Player;

public class DefaultStrategy implements Strategy {

    @Override
    public void nextMove(Player player, Deck deck, GameState gameState) {
        var playerTotal = player.getTotal();

        if (playerTotal < 17) {
            System.out.println(player + " : hit");
            player.addCard(deck.cards.pop());
        }
        else if (playerTotal <= 20) {
            var stickCount = gameState.getStickCount();
            gameState.setStickCount(stickCount + 1);
            System.out.println(player + " : stick");
        }
    }
}
