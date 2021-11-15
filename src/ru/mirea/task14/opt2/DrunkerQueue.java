package ru.mirea.task14.opt2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class DrunkerQueue {

    public static void cardFill(Queue<Integer> cards, int player)
    {
        switch (player) {
            case 1, 4 -> { // Игрок 1 - Вар1, // Игрок 2 - Вар2
                cards.add(1);
                cards.add(3);
                cards.add(5);
                cards.add(7);
                cards.add(9);
            }
            case 2 -> { // Игрок 2 - Вар1
                cards.add(2);
                cards.add(4);
                cards.add(6);
                cards.add(8);
                cards.add(0);
            }
            case 3 -> { // Игрок 1 - Вар2
                cards.add(0);
                cards.add(8);
                cards.add(6);
                cards.add(4);
                cards.add(2);
            }
            default -> { // Ручной ввод
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 5; i++) {
                    cards.add(sc.nextInt());
                }
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();
        // Раздаем карты
        cardFill(player1, 0);
        cardFill(player2, 0);
        int moves = 0;
        // Играем, пока у всех есть карты
        while (!(player1.isEmpty() || player2.isEmpty()))
        {
            int card1 = player1.poll();
            int card2 = player2.poll();
            if (card1 + card2 == 9 && card1 * card2 == 0) // 0 и 9
            {
                if (card1 < card2) // card1 == 0, значит крутой
                {
                    player1.add(card1);
                    player1.add(card2);
                }
                else {
                    player2.add(card1);
                    player2.add(card2);
                }
            } else {
                if (card1 > card2) // Большая карта, значит крутой
                {
                    player1.add(card1);
                    player1.add(card2);
                }
                else {
                    player2.add(card1);
                    player2.add(card2);
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