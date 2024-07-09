package org.example;

public class NeedForSpeedLoadingScreen extends GameLoadingScreen {
    @Override
    protected void loadLocalFiles() {
        System.out.println("Loading need for speed local files...");
    }

    @Override
    protected void createObjects() {
        System.out.println("Creating need for speed objects...");
    }

    @Override
    protected void downloadSoundsAndAudio() {
        System.out.println("Downloading default game sounds and audio...");
    }

    @Override
    protected void loadSavedProfiles() {
        System.out.println("Loading need for speed saved profiles...");
    }
}
