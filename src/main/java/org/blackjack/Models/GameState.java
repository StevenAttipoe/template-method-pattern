package org.blackjack.Models;

public class GameState {
    private boolean isComplete;
    private Player winner;
    private int stickCount;

    public GameState() {
        this.isComplete = false;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void endGame(boolean complete, Player player) {
        isComplete = complete;
        winner = player;
        System.out.println(player + " won!");
        System.out.println("Game ended");
    }

    public int getStickCount() {
        return stickCount;
    }

    public void setStickCount(int stickCount) {
        this.stickCount = stickCount;
    }
}
