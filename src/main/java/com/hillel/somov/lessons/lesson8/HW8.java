package com.hillel.somov.lessons.lesson8;


import java.util.Arrays;

public class HW8 {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[7];
        int[] playersNumbers = new int[7];
        int min = 0;
        int max = 9;


        System.out.println("Lottery numbers: ");

        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = min + (int) (Math.random() * (max - min) + 1);
        }

        Arrays.sort(lotteryNumbers);

        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (i == playersNumbers.length - 1) {

                System.out.print(lotteryNumbers[i]);
            } else {
                System.out.print(lotteryNumbers[i] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Player numbers: ");

        for (int j = 0; j < playersNumbers.length; j++) {
            playersNumbers[j] = min + (int) (Math.random() * ((max - min) + 1));
        }

        Arrays.sort(playersNumbers);

        for (int j = 0; j < playersNumbers.length; j++) {
            if (j == playersNumbers.length - 1) {
                System.out.print(playersNumbers[j]);

            } else {
                System.out.print(playersNumbers[j] + ", ");
            }
        }
        int count = 0;

        for (int i = 0; i < playersNumbers.length; i++) {
            if (lotteryNumbers[i] == playersNumbers[i]) {
                count++;

                int a = lotteryNumbers[i];
                int b = playersNumbers[i];
                if (a == b) {

                    System.out.println();
                    System.out.println("Matching index: " + i);

                }
            }
        }

        System.out.println();
        System.out.print("All numbers matched = " + count);
    }

}
