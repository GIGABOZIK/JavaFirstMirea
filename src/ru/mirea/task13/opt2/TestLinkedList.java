package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class TestLinkedList {

    public static void listOut(LinkedList<String> stu) // Вывод списка
    {
        for (int i = 0; i < stu.size(); i++)
        {
            // 3) Выбор элементов по индексу
            System.out.println((i) + ") [" + stu.indexOf(stu.get(i)) + "] " + stu.get(i));
        }
        System.out.println("Размер массива: " + stu.size());
    }

    public static void main(String[] args) {
        // 1) Создание двусвязного списка LinkedList
        LinkedList<String> stu = new LinkedList<>();
        System.out.println("Список создан. Добавляем элементы:");
        // 2) Добавление элементов
        stu.add("Word1");
        stu.add("Word2");
        stu.add("Word3");
        stu.add("Word4");
        stu.add("Word5");
        listOut(stu);
        // 4) Вставка элемента на нужную позицию
        System.out.println("");
        stu.add(1, "NewWord6");
        System.out.println("Добавлен элемент на позицию 1. Новое состояние массива:");
        listOut(stu);
        // 5) Замена элемента по номеру
        System.out.println("");
        stu.set(1, "Replaced");
        System.out.println("Заменен элемент на позиции 1. Новое состояние массива:");
        listOut(stu);
        // 6) Удаление элементов
        System.out.println("");
        stu.remove(0);
        stu.remove(0);
        stu.remove(2);
        System.out.println("Удаляем элементы. Новое состояние массива:");
        listOut(stu);
        // 7) Получение индекса элемента
        System.out.println("");
        System.out.println("Индекс элемента 'Word3':" + stu.indexOf("Word3"));
        // 8) Проверка наличия элемента
        System.out.println("");
        System.out.println("В списке содержится слово 'Word3':" + stu.contains("Word3"));
        // 9) Добавление элемента в начало
        // + 10) Добавление элемента в конец
        System.out.println("");
        stu.addFirst("addedFirst");
        stu.addLast("addedLast");
        stu.addLast("addedLast2");
        System.out.println("Добавлены элементы в начало и в конец");
        listOut(stu);
        // 11) Очистка
        // + 12) Размер списка
        System.out.println("");
        stu.clear();
        System.out.println("Очистка. Новое состояние массива:");
        listOut(stu);
    }
}
