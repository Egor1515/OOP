package ru.netology.Radio;

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentTrack;
    private int amount = 10;
    private int maxTrack = 9;
    private int minTrack = 0;


    public int getMinTrack() {
        return minTrack;
    }

    public int getMaxTrack() {
        return maxTrack;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getAmount() {
        return amount;
    }


    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > 0 & currentVolume < 100) {
            this.currentVolume = currentVolume;
            return currentVolume;
        }
        return maxVolume;
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }

    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
            return this.currentVolume;
        }
        return maxVolume;

    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int currentTrack) {
        if (currentTrack >= 0 & currentTrack <= 9) {
            this.currentTrack = currentTrack;
        } else {
            this.currentTrack = 0;
        }
    }

    public void nextTrack() {
        if (currentTrack > 0) {
            currentTrack++;
        } else {
            this.currentTrack = getMaxTrack();
        }
    }

    public void prevTrack() {
        if (currentTrack < 9) {
            currentTrack--;
        } else {
            this.currentTrack = getMinTrack();
        }
    }

    public Radio(int amount) {
        this.amount = amount;
    }

    public Radio() {
    }
}














