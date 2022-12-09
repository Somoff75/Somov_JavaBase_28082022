package com.hillel.somov.javaPRO.lessons.lesson5;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumNumbers(5, 6));
        negativeNumber(0);
        System.out.println(checkNegativeNumber(-4));
        repeatString();
        leapYear(1975);
    }
    public static void printThreeWords() {
        System.out.println("Method - printThreeWords()");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }
    public static void checkSumSign() {
        System.out.println("Method - checkSumSign()");
        int a = -10, b = 15;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Amount is positive");
        } else {
            System.out.println("Amount is negative");
        }
        System.out.println();
    }

    public static void printColor() {
        System.out.println("Method - printColor()");
        int value = -10;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
        System.out.println();

    }

    public static void compareNumbers() {
        System.out.println("Method - compareNumbers()");
        int a = 4, b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }

    public static boolean checkSumNumbers(int a, int b) {
        System.out.println("Method - checkSumNumbers()");
        int sum = a + b;
        System.out.println("The sum of the numbers is:  " + sum);
        if (sum < 10 || sum > 20) {
            return false;
        }
        return true;
    }

    public static void negativeNumber(int number) {
        System.out.println();
        System.out.println("Method - negativeNumber()");
        System.out.println("Your number is:  " + number);
        if (number < 0) {
            System.out.println("Number is negative!");

        } else {
            System.out.println("Number is positive!");
        }
        System.out.println();
    }

    public static boolean checkNegativeNumber(int number) {
        System.out.println("Method - checkNegativeNumber()");
        System.out.println("Your number is:  " + number);
        if (number >= 0) {
            return false;
        }
        return true;
    }

    public static void repeatString() {
        System.out.println();
        System.out.println("Method - repeatString()");
        String str = "My baby want Tequila!";
        int amount = 4;
        for (int i = 0; i < amount; i++) {
            System.out.println(str);
        }
    }
    public static void leapYear(int year) {
        System.out.println();
        System.out.println("Method - leapYear()");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This Year: " + "<" + year + ">" + " is Leap!");
        } else {
            System.out.println("This Year: " + "<" + year + ">" + " is not a Leap Year!");
        }
    }
}
