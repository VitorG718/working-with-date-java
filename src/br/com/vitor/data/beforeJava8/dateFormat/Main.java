package br.com.vitor.data.beforeJava8.dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println("0 - " + now);

        String dateStr = DateFormat.getInstance().format(now);
        System.out.println("1 - " + dateStr);

        dateStr = DateFormat.getDateTimeInstance().format(now);
        System.out.println("2 - " + dateStr);

        dateStr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(now);
        System.out.println("3 - " + dateStr);

        dateStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);
        System.out.println("4 - " + dateStr);

        dateStr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG).format(now);
        System.out.println("5 - " + dateStr);

        dateStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now);
        System.out.println("6 - " + dateStr);
    }
}
