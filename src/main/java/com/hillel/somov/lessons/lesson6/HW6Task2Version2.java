package com.hillel.somov.lessons.lesson6;

import java.util.Scanner;

public class HW6Task2Version2 {

    public static void main(String[] args) {

        System.out.println("Please, enter number of shuttles: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (("" + i).matches(".*([4,9]).*")) {
                continue;
            }
            System.out.println(i);
            counter++;

        }
        System.out.println("Counter shuttles: " + counter);

    }

}

