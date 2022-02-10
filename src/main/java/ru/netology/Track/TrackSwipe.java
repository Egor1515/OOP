package ru.netology.Track;

public class TrackSwipe {
    private int currentTrack;

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

