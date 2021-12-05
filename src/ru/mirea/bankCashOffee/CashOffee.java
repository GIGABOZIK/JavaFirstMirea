package ru.mirea.bankCashOffee;

import java.util.Scanner;

import ru.mirea.task17.Operations;

public class CashOffee {

    private User currentUser;
    private Operations lastOperation;


    public static void inputHandler(String s) {
        Operations operation = Operations.valueOf(s);
        if (operation.isAvailable()) {
            switch (operation) {
                case Help -> {
                    System.out.println("\nСписок доступных операций:");
                    for (Operations a : Operations.values()) {
                        if (a.isAvailable()) System.out.println("* " + a + " - " + a.getDescription());
                    }
                }
                case Auth -> {

                }
                case LogOut -> {
                    System.out.println(operation.getDescription() + "...");
                }
                case Exit -> {
                    System.out.println(operation.getDescription() + "...");
                    System.out.println("До новых встреч ;3");
                    return;
                }
            }
        } else {
            System.out.println("Эта операция недоступна");
        }
        getMessage();
    }

    static void authHandler() {
        System.out.println("Введите имя пользователя (0 - сотрудник, иное - id клиент)");
        Scanner sc = new Scanner(System.in);
    }

    private static void getMessage() {
        String s = new Scanner(System.in).nextLine();
        boolean cExist = true;
        try {
            Operations.valueOf(s);
        } catch (IllegalArgumentException e) {
            System.out.println("Такой команды не существует");
            System.out.println("! Введите \"" + Operations.valueOf("Help") + "\", чтобы " + Operations.valueOf("Help").getDescription() + "!");
            cExist = false;
        }
        if (!cExist) getMessage();
        else inputHandler(s);
    }

    static void running() {
        System.out.println("\nДобро пожаловать в приложение банка CashOffee!");
        System.out.println("Чтобы начать работу, введите команду \"Auth\"");
        System.out.println("! Введите \"" + Operations.valueOf("Help") + "\", чтобы " + Operations.valueOf("Help").getDescription() + "!");
        getMessage();
    }

    public static void main(String[] args) {
        System.out.println("Запуск...");
        running();
    }
}
