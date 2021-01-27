package ru.netology.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio orange = new Radio();

    @Test
    void getCurrentStationConsole() {
        orange.setCurrentStationConsole(4);
        assertEquals(4, orange.getCurrentStation());
    }

    @Test
    void getCurrentStationConsoleMinimum() {
        orange.setCurrentStationConsole(0);
        assertEquals(0, orange.getCurrentStation());
    }

    @Test
    void getCurrentStationConsoleMaximum() {
        orange.setCurrentStationConsole(9);
        assertEquals(9, orange.getCurrentStation());
    }

    @Test
    void getNextStation() {
        orange.setNextStation(6);
        assertEquals(7, orange.getCurrentStation());
    }
//    @Test
//    void getNextStationMaximum(){
//        orange.setNextStation(10);
//        assertEquals(0,orange.getCurrentStation());
//    }

    @Test
    void getPrevStation() {
        orange.setPrevStation(5);
        assertEquals(4, orange.getCurrentStation());
    }

    @Test
    void getCurrentVolumePlus() {
        orange.setVolumePlus(2);
        assertEquals(3, orange.getCarrentVolume());
    }

    @Test
    void getVolumPlusMax() {
        orange.setVolumePlus(5);
        assertEquals(6, orange.getCarrentVolume());
    }

    @Test
    void getVolumeMin() {
        orange.setVolumePlus(5);
        assertEquals(3, orange.getCarrentVolume());
    }
}
//    @Test
//    void getPrevStationMin(){
//        orange.setPrevStation(-1);
//        assertEquals(9,orange.getCurrentStation());
//    }



