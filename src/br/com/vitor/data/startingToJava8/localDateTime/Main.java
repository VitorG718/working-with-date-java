package br.com.vitor.data.startingToJava8.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(now);

        now = LocalDateTime.now();
        System.out.println(now);

        LocalDate currentDate = now.toLocalDate();
        System.out.println("Current date: " + currentDate);
    }
}
