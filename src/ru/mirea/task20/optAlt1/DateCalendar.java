package ru.mirea.task20.optAlt1;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.set(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("GregCalendar:\n" + gcalendar);
        //
        Date date = gcalendar.getTime();
        System.out.println("\nDate:\n" + date);
    }
}
