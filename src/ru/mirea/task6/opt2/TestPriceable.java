package ru.mirea.task6.opt2;

public class TestPriceable {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(17989, "ATLANT", 180);
        fridge.setVolume(173);
        Smartphone smartphone = new Smartphone(23590, "Samsung", 128);
        smartphone.setPrice(21990);
        //
        System.out.println(fridge);
        System.out.println(smartphone);
    }
}
