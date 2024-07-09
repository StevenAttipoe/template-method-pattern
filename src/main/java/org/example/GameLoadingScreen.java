package org.example;

public abstract class GameLoadingScreen {
    // Template method
    public final void loadGame() {
        loadLocalFiles();
        createObjects();
        downloadSoundsAndAudio();
        loadSavedProfiles();
        clearTempFiles();
    }

    // Steps to be implemented by subclasses
    protected abstract void loadLocalFiles();
    protected abstract void createObjects();
    protected abstract void downloadSoundsAndAudio();
    protected abstract void loadSavedProfiles();
    protected void clearTempFiles() {
        System.out.println("Clearing default temporary files...");
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
    }
}
