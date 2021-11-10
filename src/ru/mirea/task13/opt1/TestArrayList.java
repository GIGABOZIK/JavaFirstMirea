package ru.mirea.task13.opt1;

import ru.mirea.task12.Student;

import java.util.ArrayList;
import java.util.Random;

public class TestArrayList {

    public static void listOut(ArrayList<Student> stu)
    {
        for (int i = 0; i < stu.size() - 1; i++)
        {
            System.out.println((i) + ") " + stu.get(i));
        }
    }

    public static void main(String[] args) {
        int stuNumber = 10; // Кол-во студентов
        String[] names = {"Joe","John","Max","Bob","Ivan","Stan","Ann","Jess","Antony","Eugene"};
        Random rand = new Random();
        // 1) Создание ArrayList
        ArrayList<Student> stu = new ArrayList<>();
        System.out.println("Список создан. Добавляем элементы:");
        for (int i = 0; i < stuNumber; i++) {
            // 2) Добавление элементов
            stu.add(new Student(
                rand.nextInt(stuNumber * 100),
                names[rand.nextInt(names.length)],
                rand.nextInt(11) + 1,
                ((double) rand.nextInt(500)) / 100 // Оценки от 0.00 до 5.00
            ));
            // 3) Выбор элементов по индексу
            System.out.println((i) + ") " + stu.get(i));
        }
        // 4) Вставка элемента на нужную позицию
        stu.add(1, new Student(rand.nextInt(stuNumber * 100), "SMBD_NEW", 6, 4.56));
        System.out.println("Добавлен элемент на позицию 1. Новое состояние массива:");
        listOut(stu);
        // 5) Замена элемента по номеру
        stu.set(1, new Student(rand.nextInt(stuNumber * 100), "SMBD_REPLACED", 8, 4.32));
        System.out.println("Заменен элемент на позиции 1. Новое состояние массива:");
        listOut(stu);
        // 6) Удаление элементов
        stu.remove(0);
        stu.remove(0);
        stu.remove(2);
        System.out.println("Удаляем элементы. Новое состояние массива:");
        listOut(stu);
        // 7) Очистка
        stu.clear();
        // 8) Размер массива
        System.out.println("Очистка. Размер массива: " + stu.size());
    }
}
