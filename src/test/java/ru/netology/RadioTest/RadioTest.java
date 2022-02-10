package ru.netology.RadioTest;

import org.junit.jupiter.api.Test;
import ru.netology.Radio.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void getCurrentVolume() {
        Radio service = new Radio();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio service = new Radio();
        int expected = 10;
        int actual = service.setCurrentVolume(10);
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeLess() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeHigher() {
        Radio service = new Radio();
        service.setCurrentVolume(11);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(1);
        service.increaseVolume();
        int expected = 2;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radio service = new Radio();
        service.setCurrentVolume(10);
        service.increaseVolume();
        int expected = 10;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void lowerVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(2);
        service.lowerVolume();
        int expected = 1;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void lowerVolume1() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        service.lowerVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

}