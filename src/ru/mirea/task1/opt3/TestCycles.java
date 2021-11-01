package ru.mirea.task1.opt3;

public class TestCycles {
    public static void main(String[] args) {
        // Создание и заполнение массива
        int[] mass = new int[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * (9 - 0) + 1);
            System.out.println(mass[i]);
        }
        System.out.println("Результаты:\n");
        System.out.println(sumFor(mass));
        System.out.println(sumWhile(mass));
        System.out.println(sumDoWhile(mass));
    }
    //
    private static int sumFor(int[] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum;
    }
    //
    private static int sumWhile(int[] mass) {
        int i = 0, sum = 0;
        while (i < mass.length) {
            sum += mass[i];
            i++;
        }
        return sum;
    }
    //
    private static int sumDoWhile(int[] mass) {
        int i = 0, sum = 0;
        do {
            sum += mass[i];
            i++;
        } while (i < mass.length);
        return sum;
    }
}
