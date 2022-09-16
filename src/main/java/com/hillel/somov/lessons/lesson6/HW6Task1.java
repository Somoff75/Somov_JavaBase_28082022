package com.hillel.somov.lessons.lesson6;

import java.util.Scanner;

public class HW6Task1 {

    public static void main(String[] args) {

        System.out.println("Guess the number from 0 to 10! You have three tries! ");
        System.out.println("Enter number from 0 to 10: ");

        int number = ((int) (Math.random() * 10 + 1));
        Scanner sc = new Scanner(System.in);
        int guessNumber = sc.nextInt();

        if (guessNumber < 0 || guessNumber > 10) {

            System.out.println("Wrong range! ");
            System.exit(0);
        }


        for (int counter = 2; counter > 0; --counter) {

            if (guessNumber < 0 || guessNumber > 10) {

                System.out.println("Wrong range! ");
                System.exit(0);
            }

            if (guessNumber > number) {

                System.out.println("Your number is more! Remaining attempts: " + counter);
                guessNumber = sc.nextInt();

            } else if (guessNumber < number) {

                System.out.println("Your number is less! Remaining attempts: " + counter);
                guessNumber = sc.nextInt();
            }

        }
        if (guessNumber == number) {
            System.out.println("You win! ");
        }

        if (guessNumber > number || guessNumber < number) {
            System.out.println("You loose! ");
        }
    }
}








