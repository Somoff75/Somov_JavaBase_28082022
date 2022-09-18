package com.hillel.somov.lessons.lesson7;


public class Rugby {

    public static void main(String[] args) {

        int[] ageTeam1 = new int[25];
        int[] ageTeam2 = new int[25];
        final int GAMERS = 25;
        int min = 18;
        int max = 40;
        double sumAge1 = 0;
        double sumAge2 = 0;

        System.out.println("Age gamers Team 1: ");

        for (int i = 0; i < ageTeam1.length; i++) {

            ageTeam1[i] = min + (int) (Math.random() * ((max - min) + 1));
            sumAge1 += ageTeam1[i];

            if (i == ageTeam1.length - 1) {
                System.out.print(ageTeam1[i]);
            } else {
                System.out.print(ageTeam1[i] + ", ");
            }

        }
        System.out.println();

        System.out.print("Average age Team 1 -  " + sumAge1 / GAMERS + " years.");

        System.out.println();
        System.out.println();

        System.out.println("Age gamers Team 2: ");

        for (int y = 0; y < ageTeam2.length; y++) {
            ageTeam2[y] = min + (int) (Math.random() * ((max - min) + 1));
            sumAge2 += ageTeam2[y];

            if (y == ageTeam2.length - 1) {
                System.out.print(ageTeam2[y]);
            } else {
                System.out.print(ageTeam2[y] + ", ");
            }

        }
        System.out.println();
        System.out.print("Average age Team 2 -  " + sumAge2 / GAMERS + " years.");
    }
}








