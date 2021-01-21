package br.com.vitor.teste.data.constructors;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date newDate = new Date(); // Gets the system date and hour

        System.out.println(newDate);

        Long currentTimeMillis = System.currentTimeMillis(); // Gets the Epoch timestamp from system

        System.out.println(currentTimeMillis);

        newDate = new Date(currentTimeMillis); // Gets date from system milliseconds

        System.out.println(newDate);
    }
}
