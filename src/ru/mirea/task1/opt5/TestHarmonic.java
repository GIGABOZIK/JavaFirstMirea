package ru.mirea.task1.opt5;

public class TestHarmonic {
    public static void main(String[] args) {
        //
        int cnt = 10;
        for (int it = 1; it <= cnt; it++) {
            String str = String.format("%.3f", 1.0 / it);
            System.out.println(str);
            //System.out.println(1.0 / it);
        }
    }
}
