package ru.mirea.task17;

public enum Operations {
    Help ("Получить список доступных операций", true),
    Exit ("Выход из приложения", true),
    //Last ("Повторить последнюю операцию", false),
    //Start ("Начало работы", true),
    LogIn ("Авторизация", true),
    SignUp ("Регистрация", true),
    LogOut ("Выход из аккаунта", false),
    CheckBalance ("Проверить баланс", false),
    Transfer ("Платежи / Перевод средств", false),
    History ("История движения средств", false),
    Profile ("Посмотреть профиль", false);

    private final String description;
    private boolean isAvailable;

    Operations(String description, boolean available) {
        this.description = description;
        isAvailable = available;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
