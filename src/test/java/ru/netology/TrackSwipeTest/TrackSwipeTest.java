package ru.netology.TrackSwipeTest;

import org.junit.jupiter.api.Test;
import ru.netology.Radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrackSwipeTest {

    @Test
    void setCurrentTrack() {
        Radio track = new Radio();
        track.setCurrentTrack(9);
        int expected = 9;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentTrack1() {
        Radio track = new Radio();
        track.setCurrentTrack(10);
        int expected = 0;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentTrack2() {
        Radio track = new Radio();
        track.setCurrentTrack(-1);
        int expected = 0;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void nextTrack() {
        Radio track = new Radio();
        track.setCurrentTrack(7);
        track.nextTrack();
        int expected = 8;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void nextTrack1() {
        Radio track = new Radio();
        track.setCurrentTrack(-1);
        track.nextTrack();
        int expected = 9;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void prevTrack() {
        Radio track = new Radio();
        track.setCurrentTrack(7);
        track.prevTrack();
        int expected = 6;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void prevTrack1() {
        Radio track = new Radio();
        track.setCurrentTrack(9);
        track.prevTrack();
        int expected = 0;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

}
