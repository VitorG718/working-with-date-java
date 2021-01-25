package br.com.vitor.data.startingToJava8.period;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate pastDate = today.minusDays(367);

        Period period = Period.between(pastDate, today);

        System.out.println("Days: " + period.getDays());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Years: " + period.getYears());

        System.out.println("Total of Months: " + period.toTotalMonths());

        System.out.println("Period: " + period);
    }
}
