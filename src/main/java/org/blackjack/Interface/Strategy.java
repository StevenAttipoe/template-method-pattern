package org.blackjack.Interface;

import org.example.Models.Deck;
import org.example.Models.GameState;
import org.example.Models.Player;

public interface Strategy {
    void nextMove(Player player, Deck deck, GameState gameState);
}
