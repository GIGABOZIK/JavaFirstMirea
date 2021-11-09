package ru.mirea.task12.opt3;

import ru.mirea.task12.Student;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortMerge {
    public static void sorterMerge(int[] data, int left, int right) { // Сортировка слиянием
        int divider = left + (right - left) / 2 + 1;
        if (divider > 0 && (right - left) > 1) { // Делим массив пополам, пока можем (до 2-х элементов)
            sorterMerge(data, left, divider - 1); // Рекурсивный вызов для первой половины
            sorterMerge(data, divider, right); // Для правой половины
        }
        //
        int[] buffer = new int[right - left + 1];
        int cursor = left; // Начальная позиция для вставки наименьшего элемента из списка
        for (int i = 0; i < buffer.length; i++) {
            if (divider > right || data[cursor] > data[divider]) {
                buffer[i] = data[cursor];
                cursor++;
            } else {
                buffer[i] = data[divider];
                divider++;
            }
        }
        System.arraycopy(buffer, 0, data, left, buffer.length); // Сцепляем массивы
    }

    public static void preSorterMerge(Student[] array, int paramToSort) {
        switch (paramToSort) {
            case 0: // STOP
                return;
            case 1: // ID - int
                int[] ide = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                    ide[i] = array[i].getId();
                }
                System.out.println("Norm ID:\n" + Arrays.toString(ide));
//                Arrays.sort(ide);
                sorterMerge(ide, 0, array.length - 1);
                System.out.println("Sorted ID:\n" + Arrays.toString(ide));
                preSorterMerge(array, 101);
                break;
            case 2: // Name - String
                preSorterMerge(array, 102);
                break;
            case 3: // Grade - int
                int[] gra = new int[array.length];
                for (int i = 0; i < array.length; i++) {
                    gra[i] = array[i].getGrade();
                }
                System.out.println("Norm Grade:\n" + Arrays.toString(gra));
//                Arrays.sort(gra);
                sorterMerge(gra, 0, array.length - 1);
                System.out.println("Sorted Grade:\n" + Arrays.toString(gra));
                preSorterMerge(array, 103);
                break;
            case 4: // GPA - double
                preSorterMerge(array, 104);
                break;
            default:
                System.out.println("Try again:");
                msgForSorting();
                preSorterMerge(array, new Scanner(System.in).nextInt());
        }
    }

    public static void msgForSorting() {
        System.out.println("Enter the Parameter to sort by (0 - STOP):\n 1) ID\n 2) Name - NO\n 3) Grade\n 4) GPA - NO");
    }

    public static void main(String[] args) {
        int stuNumber = 10; // Кол-во студентов
        String[] names = {"Joe","John","Max","Bob","Ivan","Stan","Ann","Jess","Antony","Eugene"};
        Student[] stu = new Student[stuNumber];
        double[] GPA = new double[stu.length]; // Массив оценок
        Random rand = new Random();
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(
                    rand.nextInt(stuNumber * 100),
                    names[rand.nextInt(names.length)],
                    rand.nextInt(11) + 1,
                    ((double) rand.nextInt(500)) / 100 // Оценки от 0.00 до 5.00
            );
            System.out.println((i + 1) + ") " + stu[i]);
        }
        //
        msgForSorting();
        preSorterMerge(stu, new Scanner(System.in).nextInt());
    }
}