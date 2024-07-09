package org.blackjack.Interface;

import org.blackjack.Models.Deck;
import org.blackjack.Models.GameState;
import org.blackjack.Models.Player;

public interface Strategy {
    void nextMove(Player player, Deck deck, GameState gameState);
}
