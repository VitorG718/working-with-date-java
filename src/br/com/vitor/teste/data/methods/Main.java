package br.com.vitor.teste.data.methods;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date currentDate = new Date();

        Date dateInPast = new Date(658673159000L);
        // Thu Nov 15 10:45:59 BRST 1990

        Date dateInFuture = new Date(1657156423000L);
        // Wed Jul 06 22:13:43 BRT 2022

        // AFTER AND BEFORE
        if(currentDate.after(dateInPast)) {
           System.out.println(currentDate + " is after " + dateInPast);
        } else {
            System.out.println(currentDate + " is not after " + dateInPast);
        }

        if(currentDate.before(dateInFuture)) {
            System.out.println(currentDate + " is before " + dateInFuture);
        } else {
            System.out.println(currentDate + " is not before " + dateInFuture);
        }

        // COMPARETO AND EQUALS
        Date newDateInPast = new Date(658673159000L);
        if(dateInPast.equals(newDateInPast)) {
            System.out.println(dateInPast + " is equals to " + newDateInPast);
        } else {
            System.out.println(dateInPast + " is not equals to " + newDateInPast);
        }

        if(dateInPast.equals(dateInFuture)) {
            System.out.println(dateInPast + " is equals to " + dateInFuture);
        } else {
            System.out.println(dateInPast + " is not equals to " + dateInFuture);
        }

        printComparison(dateInPast.compareTo(dateInFuture));
        printComparison(dateInPast.compareTo(newDateInPast));
        printComparison(dateInFuture.compareTo(dateInPast));

    }

    static void printComparison(Integer result) {
        switch (result) {
            case -1:
                System.out.println("In the past");
                break;

            case 0:
                System.out.println("In the same date");
                break;

            case 1:
                System.out.println("In the future");
                break;
        }
    }
}
