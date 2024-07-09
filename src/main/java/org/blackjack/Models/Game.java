package org.blackjack.Models;

import org.blackjack.Interface.DefaultStrategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Game {
    private final Deck deck;
    private final List<Player> players;
    private final GameState gameState;

    public Game() {
        deck = new Deck();
        players = new ArrayList<>();
        gameState = new GameState();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void startGame() {
        deck.shuffleCards();
        System.out.println("--------Shuffled Cards---------");

        var defaultStrategy = new DefaultStrategy();
        players.addAll(List.of(
                new Player("1", defaultStrategy),
                new Player("2", defaultStrategy),
                new Player("3", defaultStrategy)
        ));
        System.out.println("--------Added Players---------");

        for(Player player: players) {
            player.addCards(List.of(deck.cards.pop(), deck.cards.pop()));
        }
        System.out.println("--------Dealt Cards To Players---------");
    }

    public void simulateRound() {
        gameState.setStickCount(0);
        Iterator<Player> iterator = players.iterator();

        while (iterator.hasNext()) {
            var player = iterator.next();
            var playerTotal = player.getTotal();

            if (playerTotal == 21) {
                System.out.println(player);
                gameState.endGame(true, player);
                break;
            } else if (playerTotal > 21) {
                iterator.remove();
                System.out.println(player + " : go bust");
                continue;
            }

            player.getStrategy().nextMove(player, deck, gameState);
        }
        determineWinner();
}

    private void determineWinner() {
        if (gameState.getStickCount() == players.size()) {
            System.out.println("All players stick in this round");
            System.out.println("Determining winner....");

            players.stream().max(Comparator.comparing(Player::getTotal))
                    .ifPresent(p ->gameState.endGame(true, p));
            return;
        }

        if (players.size() == 1) {
            gameState.endGame(true, players.get(0));
        }
    }
}
