package br.com.vitor.data.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = formatter.format(now);
        System.out.println(dateStr);

        formatter.applyPattern("dd-MM-yyyy HH:mm:ss");
        dateStr = formatter.format(now);
        System.out.println(dateStr);
    }
}
