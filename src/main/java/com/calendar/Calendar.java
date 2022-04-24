package com.calendar;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Calendar {

    private LocalDate date;
    private int today;
    private int month;
    private int weekDayValue;

    public Calendar(LocalDate date) {
        this.today = date.getDayOfMonth();
        this.month = date.getMonthValue();
        this.date = date.minusDays(this.today - 1);
        this.weekDayValue = this.date.getDayOfWeek().getValue();
    }

    public String printLabel() {
        return "  MON  TUE  WED  WHU  FRI  SAT  SUN";
    }

    public void printCalendar() {
        System.out.println(printLabel());

        for( int i = 1 ; i < weekDayValue; i++) {
            System.out.print("     ");
        }

        while(date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (today == date.getDayOfMonth()) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            if(date.getDayOfWeek().getValue() == 7) {
                System.out.println("\n");
            }
            date = date.plusDays(1);
        }
    }


}
