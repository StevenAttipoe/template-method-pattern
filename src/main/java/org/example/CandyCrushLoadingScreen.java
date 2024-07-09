package org.example;

public class CandyCrushLoadingScreen extends  GameLoadingScreen {
    @Override
    protected void loadLocalFiles() {
        System.out.println("Loading candy crush local files...");
    }

    @Override
    protected void createObjects() {
        System.out.println("Creating candy crush objects...");
    }

    @Override
    protected void downloadSoundsAndAudio() {
        System.out.println("Downloading default game sounds and audio...");
    }

    @Override
    protected void loadSavedProfiles() {
        System.out.println("Loading candy crush saved profiles...");
    }
}
