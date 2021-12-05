package ru.mirea.bankCashOffee;

import java.util.Scanner;

import ru.mirea.task17.Operations;

public class CashOffee {

    private static User currentUser;
    private Operations lastOperation;
    private static HandleDB handleDB = new HandleDB();

    static void handleHelp(int outHelp) { // Обработка команды Help | Вывод напоминания о команде Help
        if (outHelp == 1) {
            System.out.println("\nСписок доступных операций:");
            for (Operations a : Operations.values()) {
                if (a.isAvailable()) System.out.println("* " + a + " - " + a.getDescription());
            }
        } else {
            System.out.println("* Введите \"" + Operations.valueOf("Help") + "\", чтобы получить список доступных операций!");
        }
    }

    private static void handleLogIn() { // Авторизация
        System.out.println("* Введите логин:");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        User authUser = handleDB.getUserByLogin(login);
        if (authUser == null) {
            System.out.println("Пользователя с таким логином не существует! Возможно, Вы ввели его неверно.");
            handleLogIn();
        } else {
            System.out.println("* Введите пароль:");
            String password = sc.nextLine();
            if (!authUser.signCheck(login, password)) {
                System.out.println("Неверное имя пользователя и/или пароль!");
                handleLogIn();
            } else {
                Operations.LogIn.setAvailable(false);
                Operations.SignUp.setAvailable(false);
                Operations.LogOut.setAvailable(true);
                Operations.CheckBalance.setAvailable(true);
                Operations.Transfer.setAvailable(true);
                Operations.History.setAvailable(true);
                Operations.Profile.setAvailable(true);
                System.out.println("! Авторизация прошла успешно !");
                // System.out.println("USER:" + authUser);
                handleHelp(1);
            }
        }
    }

    private static void handleLogOut() {
        Operations.LogIn.setAvailable(true);
        Operations.SignUp.setAvailable(true);
        Operations.LogOut.setAvailable(false);
        Operations.CheckBalance.setAvailable(false);
        Operations.Transfer.setAvailable(false);
        Operations.History.setAvailable(false);
        Operations.Profile.setAvailable(false);
        System.out.println("! Выполнен выход из аккаунта !");
        handleHelp(1);
    }

    private static void inputHandler(String s) {
        Operations operation = Operations.valueOf(s);
        if (operation.isAvailable()) {
            System.out.println(operation.getDescription() + "...");
            switch (operation) {
                case Help -> {
                    handleHelp(1);
                }
                case LogIn -> {
                    handleLogIn();
                }
                case LogOut -> {
                    handleLogOut();
                }
                case Exit -> {
                    System.out.println("До новых встреч ;3");
                    return;
                }
            }
        } else {
            System.out.println("Эта операция недоступна");
        }
        getCommand();
    }

    private static void getCommand() { // Ввод команды пользователем
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        String cInput = new Scanner(System.in).nextLine();
        boolean cExist = true;
        try {
            Operations.valueOf(cInput);
        } catch (IllegalArgumentException e) {
            System.out.println("К сожалению, я не знаком с этой командой.");
            handleHelp(0);
            cExist = false;
        }
        if (!cExist) getCommand();
        else inputHandler(cInput);
    }

    public static void main(String[] args) {
        System.out.println("Запуск...");
        System.out.println("\nДобро пожаловать в приложение банка CashOffee!");
        System.out.println("Чтобы авторизоваться, введите команду \"Auth\"");
        handleHelp(0);
        getCommand();
        //
    }

}
