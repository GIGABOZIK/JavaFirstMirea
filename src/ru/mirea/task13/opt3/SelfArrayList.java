package ru.mirea.task13.opt3;

public class SelfArrayList <T> {
    private final int SIZE = 16; // Исходный \ Реальный размер массива
    private int sizeOf = 0; // Фактический размер списка
    private Object[] array = new Object[SIZE]; // Рабочий массив

    private void resize(int newSize) { // Изменение размера массива
        Object[] newArray = new Object[newSize]; // Создаем массив нового размера
        System.arraycopy(array, 0, newArray, 0, size()); // Копируем старый массив в начало нового массива
        array = newArray;
    }

    public void add(T obj) { // Добавление элемента в конец списка
        if (size() == (array.length - 1)) { // Размер достиг максимума
            resize(array.length + 1); // Увеличиваем размер массива
        }

        array[sizeOf++] = obj; // Вставляем новый элемент и увеличиваем размер списка
    }
    public void add(int index, T obj) { // Добавление элемента по индексу
        if (index <= size()) // Индекс не должен превышать размер массива / + вставка в конец
        {
            if (size() == (array.length - 1)) { // Размер списка достиг конца массива
                resize(array.length + 1); // Увеличиваем размер массива
            }

            for (int i = size(); i > index; i--) { // Сдвигаем элементы с нужного индекса вправо
                array[i] = array[i - 1];
            }
            array[index] = obj; // Вставляем новый элемент на освободившееся место
            sizeOf++; // Увеличиваем размер списка
        }
        else { // Предупреждение о выходе за пределы
            System.out.println("Warning! Index [" + index + "] is out of bounds!");
        }
    }

    public void set(int index, T obj) { // Замена элемента по индексу
        array[index] = obj;
    }

    public void remove(int index) { // Удаление элемента по индексу
        if (index < size()) // Индекс не должен превышать размер массива
        {
            for (int i = index; i < size(); i++) { // Сдвигаем все элементы после удаляемого влево
                array[i] = array[i + 1];
            }
            array[sizeOf--] = null; // Подчищаем конец массива и уменьшаем размер списка
        }
        else { // Предупреждение о выходе за пределы
            System.out.println("Warning! Index [" + index + "] is out of bounds!");
        }
    }

    public T get(int index) { // Получение элемента по индексу
        return (T) array[index]; // Возвращаем элемент.
    }

    public int size() { // Получение количества элементов
        return sizeOf;
    }

    public void clear() { // Очистка массива
        for (int i = 0; i < size(); i++) {
            array[i] = null;
        }
        sizeOf = 0;
    }
}
