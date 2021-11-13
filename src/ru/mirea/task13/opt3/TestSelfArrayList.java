package ru.mirea.task13.opt3;

import ru.mirea.task12.Student;
// import ru.mirea.task13.opt3.SelfArrayList; // Типа импорт

import java.util.Random;

public class TestSelfArrayList {

    public static void listOut(SelfArrayList<Student> stu)
    {
        for (int i = 0; i < stu.size(); i++)
        {
            System.out.println((i) + ") " + stu.get(i));
        }
        System.out.println("Размер массива: " + stu.size() + "\n");
    }

    public static void main(String[] args) {
        int stuNumber = 5; // Кол-во студентов
        String[] names = {"Joe","John","Max","Bob","Ivan","Stan","Ann","Jess","Antony","Eugene"};
        Random rand = new Random();
        // 1) Создание ArrayList
        SelfArrayList<Student> stu = new SelfArrayList<>();
        System.out.println("Список создан. Добавляем элементы:");
        for (int i = 0; i < stuNumber; i++) {
            // 2) Добавление элементов в конец
            stu.add(new Student(
                rand.nextInt(stuNumber * 100),
                names[rand.nextInt(names.length)],
                rand.nextInt(11) + 1,
                ((double) rand.nextInt(500)) / 100 // Оценки от 0.00 до 5.00
            ));
            // 3) Выбор элементов по индексу
            System.out.println((i) + ") " + stu.get(i));
        }
        System.out.println("Размер массива: " + stu.size());
        // 4.1) Вставка элемента на нужную позицию
        stu.add(1, new Student(rand.nextInt(stuNumber * 100), "SMBD_NEW", 6, 4.56));
        System.out.println("Добавлен элемент на позицию 1. Новое состояние массива:");
        listOut(stu);
        // 4.2) Вставка элемента на нужную позицию (вставка в конец)
        stu.add(6, new Student(rand.nextInt(stuNumber * 100), "SMBD_NEW", 6, 4.56));
        System.out.println("Добавлен элемент на позицию 6. Новое состояние массива:");
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
        System.out.println("Очистка. Новое состояние массива:");
        listOut(stu);
    }
}