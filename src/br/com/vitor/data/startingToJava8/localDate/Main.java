package br.com.vitor.data.startingToJava8.localDate;

import java.time.LocalDate;
import java.time.temporal.TemporalField;

/**
 * This API works only with date
 */
public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);

        LocalDate futureDate = currentDate.plusDays(3);
        System.out.println(futureDate);

        LocalDate pastDate = currentDate.minusDays(1);
        System.out.println(pastDate);

        System.out.println("Day's current date: " + currentDate.getDayOfMonth());
    }
}
