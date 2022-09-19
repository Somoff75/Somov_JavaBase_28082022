package com.hillel.somov.lessons.lesson7;

import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        int cardsPlayer = 5;
        int players;

        String[] cardSsuits = {"\u2660", "\u2665", "\u2663", "\u2666"};

        String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

        int n = cardSsuits.length * cardRank.length;

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();

                if (cardsPlayer * players <= n) {
                    break;

                } else {
                    if (players == 0) {
                        System.out.println("The game has stopped.");
                        break;

                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");

                    } else {
                        System.out.println("Too many players!");

                    }
                }
            } else {
                System.out.println("You have not entered a number!");
            }
        }

        String[] deck = new String[n];
        for (int i = 0; i < cardRank.length; i++) {
            for (int j = 0; j < cardSsuits.length; j++) {
                deck[cardSsuits.length * i + j] = cardRank[i] + " " + cardSsuits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int g = i + (int) (Math.random() * (n - i));
            String variable = deck[g];
            deck[g] = deck[i];
            deck[i] = variable;
        }

        for (int i = 0; i < players * cardsPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPlayer == cardsPlayer - 1)
                System.out.println();
        }
    }
}
