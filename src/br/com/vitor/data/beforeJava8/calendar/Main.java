package br.com.vitor.data.beforeJava8.calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        System.out.println(now.getTime());

        System.out.println("Date: "+now.get(Calendar.DAY_OF_MONTH));
        System.out.println("Month: "+now.get(Calendar.MONTH)); // Month starts with zero
        System.out.println("Year: "+now.get(Calendar.YEAR));

        System.out.println("Hour: "+now.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutes: "+now.get(Calendar.MINUTE));
        System.out.println("Seconds: "+now.get(Calendar.SECOND));
        System.out.println("Milliseconds: "+now.get(Calendar.MILLISECOND));

        now.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println("Yesterday: " + now.getTime());

        Calendar anotherDate = Calendar.getInstance();
        anotherDate.set(2022, 6, 10, 10, 53, 32);
        System.out.println("Another date: " + anotherDate.getTime());
    }
}
