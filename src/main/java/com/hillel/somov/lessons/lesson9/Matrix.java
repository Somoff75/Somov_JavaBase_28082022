package com.hillel.somov.lessons.lesson9;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows");

        int m = 0;

        if (sc.hasNextInt()) {
            m = sc.nextInt();
            if (m < 0) {
                System.out.println("Value cannot be negative");
                System.exit(0);
            }
        } else {
            System.out.println("The input data can only be an integer!");
            System.exit(0);
        }

        System.out.println("Enter columns");

        int n = 0;

        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Value cannot be negative");
                System.exit(0);
            }
        } else {
            System.out.println("The input data can only be an integer!");
            System.exit(0);
        }

        System.out.println("Enter max numbers");
        int max = sc.nextInt();

        int[][] array1 = new int[m][];
        int[][] array2 = new int[n][];

        for (int i = 0; i < array2.length; i++)
            array2[i] = new int[m];

        System.out.println("BEFORE");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new int[n];
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = ((int) (Math.random() * max));
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];

            }
        }

        System.out.println("AFTER");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
