package ru.mirea.task14.opt1;

import java.util.Scanner;
import java.util.Stack;

public class DrunkerStack {

    public static void cardFill(Stack<Integer> cards, int player)
    {
        //Stack<Integer> cards = new Stack<>();
        switch (player) {
            case 1, 4 -> { // Игрок 1 - Вар1, // Игрок 2 - Вар2
                cards.push(1);
                cards.push(3);
                cards.push(5);
                cards.push(7);
                cards.push(9);
            }
            case 2 -> { // Игрок 2 - Вар1
                cards.push(2);
                cards.push(4);
                cards.push(6);
                cards.push(8);
                cards.push(0);
            }
            case 3 -> { // Игрок 1 - Вар2
                cards.push(0);
                cards.push(8);
                cards.push(6);
                cards.push(4);
                cards.push(2);
            }
            // Игрок 2 - Вар2
            default -> { // Ручной ввод
                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 5; i++) {
                    cards.push(sc.nextInt());
                }
            }
        }
        // Складываем карты в колоду игроку
        //for (int i = 0; i < 5; i++) {
        //    pCards.push(cards.pop());
        //}
    }

    public static void main(String[] args) {
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        // Раздаем карты
        cardFill(player1, 0);
        cardFill(player2, 0);
        int moves = 0;
        // Играем, пока у всех есть карты
        while (!(player1.empty() || player2.empty()))
        {
            int card1 = player1.get(0);
            int card2 = player2.get(0);
            player1.removeElementAt(0);
            player2.removeElementAt(0);
            if (card1 + card2 == 9 && card1 * card2 == 0) // 0 и 9
            {
                if (card1 < card2) // card1 == 0, значит крутой
                {
                    player1.push(card1);
                    player1.push(card2);
                }
                else {
                    player2.push(card1);
                    player2.push(card2);
                }
            } else {
                if (card1 > card2) // Большая карта, значит крутой
                {
                    player1.push(card1);
                    player1.push(card2);
                }
                else {
                    player2.push(card1);
                    player2.push(card2);
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
        if (player2.empty()) {
            System.out.println("first " + moves);
        }
        else {
            System.out.println("second " + moves);
        }
    }
}