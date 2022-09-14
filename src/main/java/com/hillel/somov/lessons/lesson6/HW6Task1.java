package com.hillel.somov.lessons.lesson6;

import java.util.Scanner;

public class HW6Task1 {

    public static void main(String[] args) {

        System.out.println("Guess the number from 1 to 10! You have three tries! ");
        System.out.println("Enter number from 1 to 10: ");

        int number = ((int) (Math.random() * 10 + 1));
        Scanner sc = new Scanner(System.in);
        int guessNumber = sc.nextInt();

        if (guessNumber > number || guessNumber < number) {

            if (guessNumber <= 0 || guessNumber > 10) {

                System.out.println("Wrong range! ");
                System.exit(0);

            }

            for (int counter = 2; counter > 0; --counter) {

                if (guessNumber > number) {
                    if (guessNumber <= 0 || guessNumber > 10) {

                        System.out.println("Wrong range! ");
                        System.exit(0);}

                    System.out.println("Your number is more! Remaining attempts: " + counter);
                    Scanner sc1 = new Scanner(System.in);
                    guessNumber = sc1.nextInt();

                } else if (guessNumber < number) {

                    System.out.println("Your number is less! Remaining attempts: " + counter);
                    Scanner sc2 = new Scanner(System.in);
                    guessNumber = sc2.nextInt();
                }

            }
            if (guessNumber == number) {
                System.out.println("You win! ");
            }

        }
        if (guessNumber <= 0 || guessNumber > 10) {

            System.out.println("Wrong range! ");
            System.exit(0);
        }
        if (guessNumber > number || guessNumber < number) {
            System.out.println("You loose! ");

        }

    }

}


