package ru.mirea.bankCashOffee;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HandleDB {
    private static final String FILE_PATH_USERS = "src/ru/mirea/bankCashOffee/users.txt";
    private static final String FILE_PATH_WALLETS = "src/ru/mirea/bankCashOffee/wallets.txt";
    File dbUsers = new File(FILE_PATH_USERS);
    File dbWallets = new File(FILE_PATH_WALLETS);
    ArrayList<User> users = new ArrayList<>();

    HandleDB() {
        try {
            getUsers();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удалось загрузить данные из БД");
            System.exit(1);
        }
    }

    private void getUsers() throws IOException {
        FileReader fr = new FileReader(dbUsers);
        Scanner sc = new Scanner(fr);
        //
        sc.nextLine();
        while (sc.hasNext()) {
            User user = new User();
            String[] userData = sc.nextLine().split("; ");
            //
            user.setId(Integer.parseInt(userData[0]));
            user.setNameFirst(userData[1]);
            user.setNameLast(userData[2]);
            user.setLogin(userData[3]);
            user.setPassword(userData[4]);
            user.setEmployee(Boolean.parseBoolean(userData[5]));
            user.setWalletId(Integer.parseInt(userData[6]));
            //
            users.add(user);
        }
        fr.close();
    }

    //

    public User getUserByLogin(String login) {
        User user = null;
        for (User value : users) {
            if (value.getLogin().equals(login)) {
                user = value;
                break;
            }
        }
        return user;
    }
}
