package ru.mirea.bankCashOffee;

public class User {
    private static int ids = 0;
    private int id;
    private boolean isEmployee;
    private String nameFirst, nameLast;

    User(boolean isEmployee, String nameFirst, String nameLast) {
        this.id = ids++;
        this.isEmployee = isEmployee;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", isEmployee=" + isEmployee +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                '}';
    }
}

