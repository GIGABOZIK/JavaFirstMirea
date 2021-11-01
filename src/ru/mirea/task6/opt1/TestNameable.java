package ru.mirea.task6.opt1;

public class TestNameable {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.97);
        Planet mars = new Planet("Mars", 0.642);
        System.out.println(earth);
        System.out.println(mars);
        Car mazda = new Car("Mazda", "Sedan", 200);
        System.out.println(mazda);
        Animal human = new Animal("Joe", "Mammal", false);
        Animal dog = new Animal("Bobik", "Mammal", true);
        System.out.println(human);
        System.out.println(dog);
    }
}
