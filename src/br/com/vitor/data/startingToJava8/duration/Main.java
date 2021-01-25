package br.com.vitor.data.startingToJava8.duration;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime lastHour = now.minusHours(1);

        Duration duration = Duration.between(lastHour, now);
        System.out.println("Duration: " + duration);

        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
        System.out.println("Seconds: " + duration.toSeconds());

        System.out.println("Hours part: " + duration.toHoursPart());
        System.out.println("Minutes part: " + duration.toMinutesPart());
        System.out.println("Seconds part: " + duration.toSecondsPart());
    }
}
