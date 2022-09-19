package com.hillel.somov.lessons.lesson7;

public class Rugby2 {

    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int age;
        int min = 18;
        int max = 40;
        final int GAMERS = 25;
        double sumAge1 = 0;
        double sumAge2 = 0;

        for (int i = 0; i < team1.length; i++) {
            age = min + (int) (Math.random() * (max - min));
            sumAge1 += age++;

            System.out.println("Gamer " + (i + 1) + " Team 1 - " + " age " + age);
        }
        System.out.println();

        System.out.print("Average age Team 1 -  " + sumAge1 / GAMERS + " years.");

        System.out.println();
        System.out.println();

        for (int i = 0; i < team2.length; i++) {
            age = min + (int) (Math.random() * (max - min));
            sumAge2 += age++;

            System.out.println("Gamer " + (i + 1) + " Team 2 - " + " age " + age);

        }

        System.out.println();
        System.out.print("Average age Team 2 -  " + sumAge2 / GAMERS + " years.");


    }


}
