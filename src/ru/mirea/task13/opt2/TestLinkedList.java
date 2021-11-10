package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class TestLinkedList {

    public static void listOut(LinkedList<String> st) // Вывод списка
    {
        for (int i = 0; i < st.size() - 1; i++)
        {
            // 3) Выбор элементов по индексу
            System.out.println((i) + ") [" + st.indexOf(st.get(i)) + "] " + st.get(i));
        }
    }

    public static void main(String[] args) {
        // 1) Создание двусвязного списка LinkedList
        LinkedList<String> st = new LinkedList<>();
        System.out.println("Список создан. Добавляем элементы:");
        // 2) Добавление элементов
        st.add("Word1");
        st.add("Word2");
        st.add("Word3");
        st.add("Word4");
        st.add("Word5");
        listOut(st);
        // 4) Вставка элемента на нужную позицию
        st.add(1, "NewWord6");
        System.out.println("Добавлен элемент на позицию 1. Новое состояние массива:");
        listOut(st);
        // 5) Замена элемента по номеру
        st.set(1, "Replaced");
        System.out.println("Заменен элемент на позиции 1. Новое состояние массива:");
        listOut(st);
        // 6) Удаление элементов
        st.remove(0);
        st.remove(0);
        st.remove(2);
        System.out.println("Удаляем элементы. Новое состояние массива:");
        listOut(st);
        // 7) Получение индекса элемента
        System.out.println("Индекс элемента 'Word3':" + st.indexOf("Word3"));
        // 8) Проверка наличия элемента
        System.out.println("В списке содержится слово 'Word3':" + st.contains("Word3"));
        // 9) Очистка
        // + 10) Размер списка
        st.clear();
        System.out.println("Очистка. Размер массива: " + st.size());
    }
}
