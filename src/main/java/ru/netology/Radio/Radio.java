package ru.netology.Radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentTrack;
    private int amount = 10;
    private int maxTrack = 9;
    private int minTrack = 0;
}


