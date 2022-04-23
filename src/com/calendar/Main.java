package com.calendar;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();

        date = date.minusDays(today - 1);
        int  weekdayValue = date.getDayOfWeek().getValue();

        System.out.println("  MON  TUE  WED  WHU  FRI  SAT  SUN");

        for( int i = 1 ; i < weekdayValue; i++) {
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
