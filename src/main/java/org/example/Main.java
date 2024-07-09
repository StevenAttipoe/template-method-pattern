package org.example;

public class Main {
    public static void main(String[] args) {
        var candyCrushLoading = new CandyCrushLoadingScreen();
        var needForSpeedLoading = new NeedForSpeedLoadingScreen();

        candyCrushLoading.loadGame();
        needForSpeedLoading.loadGame();
    }
}