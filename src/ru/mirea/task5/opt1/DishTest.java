package ru.mirea.task5.opt1;

public class DishTest {
    public static void main(String[] args) {
        Dish mug = new Mug();
        Dish plate = new Plate();
        Dish pot = new Pot();
        Dish spoon = new Spoon();
        mug.setMaterial("paper");
        plate.setColor("almost white");
        System.out.println(mug);
        System.out.println(plate);
        System.out.println(pot);
        System.out.println(spoon);
    }
}
