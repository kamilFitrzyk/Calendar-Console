package com.calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    Calendar calendar;

    @BeforeEach
    void setUp() {
        LocalDate now = LocalDate.now();
        calendar = new Calendar(now);
    }

    @Test
    void printLabel() {
        Assertions.assertEquals("  MON  TUE  WED  WHU  FRI  SAT  SUN", calendar.printLabel());
    }
}