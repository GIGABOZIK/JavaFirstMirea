package ru.mirea.bankCashOffee;

public class User {
    private int id;
    private String nameFirst, nameLast, login, password;
    private boolean isEmployee;
    private int walletId;

    User() {};

    public boolean signCheck(String log, String pwd) {
        return (log.equals(login) && pwd.equals(password));
    }
    public boolean signCheck_s(String word) {
        return (word.equals("ggbzk"));
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                ", isEmployee=" + isEmployee +
                ", walletId=" + walletId +
                '}';
    }

    // getters, setters:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }
}

