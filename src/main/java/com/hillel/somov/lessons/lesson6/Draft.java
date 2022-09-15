package com.hillel.somov.lessons.lesson6;

import java.util.Scanner;

public class Draft {
    private static boolean unlikeNum(int num) {
        int i = num % 10;
        do {
            if (i == 4 || i == 9)
                return false;
            num /= 10;
            i = num % 10;
        } while (num > 0);
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please, enter number of shuttles you need: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int count1 = 1;
        while (count < n) {
            if (unlikeNum(count1)) {
                System.out.println(count1);
                count++;
            }
            count1++;
        }
        System.out.println("Your shuttle numbers are on the list.  ");
        System.out.println("Counter shuttles - " + count);

    }

}



