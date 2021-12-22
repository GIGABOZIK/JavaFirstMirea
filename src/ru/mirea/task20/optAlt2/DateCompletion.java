package ru.mirea.task20.optAlt2;

import java.util.Date;
import java.util.Scanner;

public class DateCompletion {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Juan", new Scanner(System.in).nextLine());
        System.out.println(dev1 + "\n");
        dev1.setDateEndToCur();
        System.out.println(dev1);
    }
}

class Developer{
    private final String name;
    private final String dateStart;
    private String dateEnd = "-1";
    Developer(String name, String dateStart){
        this.name = name;
        this.dateStart = dateStart;
    }

    public void setDateEndToCur() {
        this.dateEnd = new Date().toString();
    }
    public String getName() {
        return name;
    }
    public String getDateStart() {
        return dateStart;
    }
    public String getDateEnd() {
        return (dateEnd.equals("-1")) ? "Not completed yet" : dateEnd;
    }

    public String toString() {
        return "Dev: " + getName()
                + "\nTask Start: " + getDateStart()
                + "\nTask End: " + getDateEnd();
    }
}