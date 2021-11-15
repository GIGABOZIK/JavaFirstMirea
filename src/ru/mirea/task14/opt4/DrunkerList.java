package ru.mirea.task14.opt4;

import java.util.Scanner;
import java.util.LinkedList;

public class DrunkerList {

    public static void cardFill(LinkedList<Integer> cards, int player)
    {
        switch (player) {
            case 1, 4 -> { // Игрок 1 - Вар1, // Игрок 2 - Вар2
                cards.addLast(1);
                cards.addLast(3);
                cards.addLast(5);
                cards.addLast(7);
                cards.addLast(9);
            }
            case 2 -> { // Игрок 2 - Вар1
                cards.addLast(2);
                cards.addLast(4);
                cards.addLast(6);
                cards.addLast(8);
                cards.addLast(0);
            }
            case 3 -> { // Игрок 1 - Вар2
                cards.addLast(0);
                cards.addLast(8);
                cards.addLast(6);
                cards.addLast(4);
                cards.addLast(2);
            }
            default -> { // Ручной ввод
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 5; i++) {
                    cards.addLast(sc.nextInt());
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> player1 = new LinkedList<>();
        LinkedList<Integer> player2 = new LinkedList<>();
        // Раздаем карты
        cardFill(player1, 0);
        cardFill(player2, 0);
        int moves = 0;
        // Играем, пока у всех есть карты
        while (!(player1.isEmpty() || player2.isEmpty()))
        {
            int card1 = player1.pop();
            int card2 = player2.pop();
            if (card1 + card2 == 9 && card1 * card2 == 0) // 0 и 9
            {
                if (card1 < card2) // card1 == 0, значит крутой
                {
                    player1.addLast(card1);
                    player1.addLast(card2);
                }
                else {
                    player2.addLast(card1);
                    player2.addLast(card2);
                }
            } else {
                if (card1 > card2) // Большая карта, значит крутой
                {
                    player1.addLast(card1);
                    player1.addLast(card2);
                }
                else {
                    player2.addLast(card1);
                    player2.addLast(card2);
                }
            }
            //
            moves++;
            // Проверка на лимит ходов
            if (moves == 106)
            {
                System.out.println("botva");
                break;
            }
        }
        // Определение победителя
        if (player2.isEmpty()) {
            System.out.println("first " + moves);
        }
        else {
            System.out.println("second " + moves);
        }
    }
}