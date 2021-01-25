package br.com.vitor.data.startingToJava8.localTime;

import java.time.LocalTime;

/**
 * That API works with time only
 */
public class Main {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current time: " + currentTime);
        System.out.println("Hour of current time: " + currentTime.getHour());
        System.out.println("Minus 1 hour from current time: " + currentTime.minusHours(1));

        LocalTime anyTime = LocalTime.of(13, 43, 53);
        System.out.println("Any time: " + anyTime);
    }
}
