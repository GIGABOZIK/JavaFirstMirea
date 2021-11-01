package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Joe", "imjoe@mail.ru", 'M');
        System.out.println(author1.toString());
        author1.setEmail("emjoyker@gmail.com");
        System.out.println(author1.toString());
    }
}