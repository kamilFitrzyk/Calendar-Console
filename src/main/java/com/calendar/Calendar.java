package com.calendar;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Calendar {

    private int today;
    private int month;

    public Calendar(LocalDate date) {
        this.today = date.getDayOfMonth();
        this.month = date.getMonthValue();
    }

    public String printLabel() {
        return "  MON  TUE  WED  WHU  FRI  SAT  SUN";
    }


}
