package ru.mirea.task2.opt4;

public class Dog {
    // Fields:
    private String name;
    private int age;
    // Constructors:
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }
    public Dog() {
        name = "Puppy";
        age = 0;
    }
    // Methods:
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(String name) { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public void translateIntoHumanAge() {
        System.out.println(name + "'s age in human years is " + age*7 + " years!");
    }
    public String toString() {
        return this.name + ", age " + this.age;
    }
}