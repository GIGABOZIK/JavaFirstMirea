package ru.mirea.task12.opt2;

import ru.mirea.task12.Student;

import java.util.Arrays;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator {
    //
    public double[] sorterQuick(double[] array, int lo, int hi) {
        int l = lo;
        int r = hi;
        double pivot = array[(l + r) / 2]; // Опорный элемент
        //
        do { // Распределение элементов слева и справа от опорного
            while (array[l] < pivot) { // Двигаемся вправо, пока элементы меньше опорного
                                // Пока не найдем элемент, больший\равный опорному
                l++;
            }
            while (array[r] > pivot) { // Двигаемся влево, пока элементы больше опорного
                                // Пока не найдем элемент, меньший\равный опорному
                r--;
            }
            if (l <= r) {
                if (l < r) { // Меняем местами элементы
                    double temp = array[l];
                    array[l] = array[r];
                    array[r] = temp;
                }
                l++;
                r--;
            }
        } while (l <= r);
        //
        if (l < hi) {
            sorterQuick(array, l, hi);
        }
        if (lo < r) {
            sorterQuick(array, lo, r);
        }
        //
        return array;
    }
    public double[] sorterQuick(double[] array) { // Просто Перегрузка
//        return sorterQuick(array, 0, array.length);
        return sorterQuick(array, 0, array.length - 1);
    }
    //
    public static void main(String[] args) {
        int stuNumber = 10; // Кол-во студентов
        String[] names = {"Joe","John","Max","Bob","Ivan","Stan","Ann","Jess","Antony","Eugene"};
        Student[] stu = new Student[stuNumber];
        double[] GPA = new double[stu.length]; // Массив оценок
        Random rand = new Random();
        //
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(
                    rand.nextInt(stuNumber * 100),
                    names[rand.nextInt(names.length)],
                    rand.nextInt(11) + 1,
                    ((double) rand.nextInt(500)) / 100 // Оценки от 0.00 до 5.00
//                    rand.nextDouble() * 5.0 // Так слишком много знаков после запятой((
            );
            System.out.println((i + 1) + ") " + stu[i]);
            GPA[i] = stu[i].getGPA(); // Записываем массив оценок
        }
//        GPA[3] = GPA[5];
//        GPA[4] = GPA[3];
        //
        System.out.println("GPA: " + Arrays.toString(GPA));
        //
        System.out.println("Sort By GPA:");
        GPA = new SortingStudentsByGPA().sorterQuick(GPA);
//        Arrays.sort(GPA);
//        for (int i = 0; i < stu.length; i++) {
//            for (int j = 0; j < stu.length; j++) {
//                if (stu[j].getGPA() == GPA[i]) {
//                    System.out.println(i + ") " + stu[j]);
//                }
//            }
//        }
        System.out.println("GPA: " + Arrays.toString(GPA));
    }
}
