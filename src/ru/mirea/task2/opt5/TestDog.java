package ru.mirea.task2.opt5;

import ru.mirea.task2.opt4.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog[] dog = new Dog[4];
        dog[0] = new Dog("Rex", 2);
        dog[1] = new Dog("Max");
        dog[2] = new Dog();
        dog[3] = new Dog();
        //
        dog[3].setAge(11);
        dog[3].setName("Goldy");
        //
        System.out.println(dog[0]);
        System.out.println(dog[1]);
        dog[2].translateIntoHumanAge();
        dog[3].translateIntoHumanAge();
    }
}