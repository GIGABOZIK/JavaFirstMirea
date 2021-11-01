package ru.mirea.task1.opt6;

import java.util.Random;

public class TestRands {
    public static void main(String[] args) {
        //
        // С использованием Math
        System.out.println("Math.random() :\r\n");
        int[] myArray1 = new int[10];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = (int) (Math.random() * ((99-0)+1));
        }
        fuOutSortOut(myArray1);
        //
        // С использованием Random
        System.out.println("\r\nRandom :\r\n");
        int[] myArray2 = new int[10];
        Random rando = new Random();
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = rando.nextInt(99);
        }
        fuOutSortOut(myArray2);
    }
    //
    public static void fuOutSortOut(int[] array0) {
        System.out.println("\r\n Origin:\r\n");
        for (int i = 0; i < array0.length; i++) {
            System.out.println(array0[i]);
        }
        //
        int smth2;
        for (int i = 0; i < array0.length; i++) {
            for (int j = i + 1; j < array0.length; j++) {
                if (array0[j] < array0[i]) { // По возрастанию
                    smth2 = array0[i];
                    array0[i] = array0[j];
                    array0[j] = smth2;
                }
            }
        }
        //
        System.out.println("\r\n Sorted:\r\n");
        for (int i = 0; i < array0.length; i++) {
            System.out.println(array0[i]);
        }
    }
}
