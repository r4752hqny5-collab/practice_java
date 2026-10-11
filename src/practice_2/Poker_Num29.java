package practice_2;

import java.util.Scanner;

import java.util.Random;

public class Poker_Num29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int players;

        do {
            System.out.print("Введите количество игроков от 1 до 10: ");
            players = scanner.nextInt();
        } while (players < 1 || players > 10);

        String[] suits = {"Пики", "Червы", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        String[] deck = new String[52];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " — " + suits[i];
                index++;
            }
        }
        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        int cardIndex = 0;

        for (int player = 1; player <= players; player++) {
            System.out.println("Игрок " + player + ":");

            for (int card = 0; card < 5; card++) {
                System.out.println(deck[cardIndex]);
                cardIndex++;
            }

            System.out.println();
        }
    }
}
