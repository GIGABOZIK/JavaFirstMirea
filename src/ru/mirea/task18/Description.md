# Task 18. Обработка исключений
## Пример обработки исключения в коде проекта:
Здесь отслеживается ввод команды.
При вводе несуществующей команды выводится предупреждение.
Фрагмент кода:

    private static void getMessage() { // Ввод команды пользователем
        String s = new Scanner(System.in).nextLine();
        boolean cExist = true;
        try {
            Operations.valueOf(s);
        } catch (IllegalArgumentException e) {
            System.out.println("Такой команды не существует");
            System.out.println("* Введите \"" + Operations.valueOf("Help") + "\", чтобы " + Operations.valueOf("Help").getDescription() + " *");
            cExist = false;
        }
        if (!cExist) getMessage();
        else inputHandler(s);
    }

## Ссылка на папку проекта
https://github.com/GIGABOZIK/JavaFirstMirea/tree/master/src/ru/mirea/bankCashOffee
