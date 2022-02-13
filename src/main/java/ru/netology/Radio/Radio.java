package ru.netology.Radio;

public class Radio {

    private int currentVolume;
    private int currentTrack;

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
            this.currentTrack = 9;
        }
    }


    public void prevTrack() {
        if (currentTrack < 9) {
            currentTrack--;
        } else {
            this.currentTrack = 0;
        }

    }
}














