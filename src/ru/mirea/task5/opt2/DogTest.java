package ru.mirea.task5.opt2;

public class DogTest {
    public static void main(String[] args) {
        Dog york = new YorkshireTerrier("Monya", 8, 10, true, "normal");
        york.setAge(9);
        york.setFurType("Normal");
        Dog russel = new JackRusselTerrier();
        russel.setName("Dupe");
        russel.setAge(1);
        russel.setWeight(8);
        russel.setFurType("Short");
        System.out.println(york);
        System.out.println(russel);
    }
}
