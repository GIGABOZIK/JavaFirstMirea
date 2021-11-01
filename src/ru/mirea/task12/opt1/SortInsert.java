package ru.mirea.task12.opt1;

import ru.mirea.task12.Student;

import java.util.Random;

public class SortInsert {
    public static int[] sorterInsert(int[] iDNumber) { // Сортировка вставками
        for (int seek = 1; seek < iDNumber.length; seek++) { // Обход всего массива, кроме 0
            int walker = iDNumber[seek]; // Выбрали элемент для сравнения
            int walk = seek; // Номер выбранного элемента для обхода
            while (walk > 0 && walker < iDNumber[walk - 1]) { // Обход от выбранного элемента влево
                    // Первое условие walk>0 - для избежания выхода за пределы массива в следующем условии
                iDNumber[walk] = iDNumber[walk - 1]; // Сдвиг бОльшего элемента вправо
                walk--;
            }
            iDNumber[walk] = walker; // Установка элемента
        }
        return iDNumber;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int stuNumber = 7;
        String[] names = {"Joe","John","Max","Bob","Ivan","Stan","Ann","Jess","Antony","Eugene"};
        Student[] stu = new Student[stuNumber];
        int[] iDNumber = new int[stu.length];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(
                    /*(i+1) * */(int)(Math.random() * 1000),
                    names[rand.nextInt(names.length)],
                    rand.nextInt(11) + 1,
                    ((double) rand.nextInt(50)) / 10
            );
            iDNumber[i] = stu[i].getId(); // Пишем массив для сортировки
            System.out.println(iDNumber[i]);
        }
        iDNumber = sorterInsert(iDNumber);
        System.out.println("SORT (ORDER ASCENDING ID)");
        for (int i = 0; i < stu.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}
