package org.aparna;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class HelperClass {

    public static String getCurrentMonth() {
        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();
        return month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static int getCurrentYear() {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        return year;
    }

    public static String getFormattedWeek() {

        // Nov 13 — 19, 2022
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd");
        LocalDate todaysDate = LocalDate.now();
        LocalDate thisWeeksSunday = todaysDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        LocalDate thisWeeksSaturday = todaysDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        String startOfWeekDateOnly = thisWeeksSunday.format(dateFormatter);
        String endOfWeekDateOnly = thisWeeksSaturday.format(dateFormatter);

        int year = todaysDate.getYear();
        String month = thisWeeksSunday.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

        return month + " " + startOfWeekDateOnly + " — " + endOfWeekDateOnly + ", " + year;

    }

    public static String getFormattedDay() {
        //November 13, 2022

        LocalDate todayDate = LocalDate.now();


        String month = todayDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd"); //to extract date  from any date

        String numericDate = todayDate.format(dateFormatter);

        int year = todayDate.getYear();


        return String.format("%s %s, %s", month, numericDate, year);


    }

    public static String getFormattedMonth() {
        //dayNovember 2022

        LocalDate todayDate = LocalDate.now();
        String month = todayDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int year = todayDate.getYear();
        return String.format("%s %s", month, year);
    }
}
