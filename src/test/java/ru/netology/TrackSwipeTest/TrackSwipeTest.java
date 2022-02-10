package ru.netology.TrackSwipeTest;

import org.junit.jupiter.api.Test;
import ru.netology.Track.TrackSwipe;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrackSwipeTest {

    @Test
    void setCurrentTrack() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(9);
        int expected = 9;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentTrack1() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(10);
        int expected = 0;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentTrack2() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(-1);
        int expected = 0;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void nextTrack() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(7);
        track.nextTrack();
        int expected = 8;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void nextTrack1() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(-1);
        track.nextTrack();
        int expected = 9;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void prevTrack() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(7);
        track.prevTrack();
        int expected = 6;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

    @Test
    void prevTrack1() {
        TrackSwipe track = new TrackSwipe();
        track.setCurrentTrack(9);
        track.prevTrack();
        int expected = 0;
        int actual = track.getCurrentTrack();
        assertEquals(expected, actual);
    }

}
