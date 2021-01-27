package ru.netology.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class RadioTest {
    Radio orange = new Radio();

    @Test
    void getCurrentStationlConsole() {
        orange.setCurrentStationConsole(4);
        assertEquals(4, orange.getCurrentStationConsole());
    }
}