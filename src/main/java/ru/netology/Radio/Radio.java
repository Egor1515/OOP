package ru.netology.Radio;

public class Radio {

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > 0 & currentVolume <= 10) {
            this.currentVolume = currentVolume;
            return currentVolume;
        }
        return currentVolume;

    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;

        }

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
}














