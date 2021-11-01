package ru.mirea.task3.opt2;

public class HumanTest {
    public static void main(String[] args) {
        Human smbd = new Human();
        Human jess = new Human("Jess", 'W',
                "bob", "bright", "green", 32,
                false, 2, false, 84,
                false, 4, "conical", 95
                );
        System.out.println(smbd);
        System.out.println(jess);
    }
}
