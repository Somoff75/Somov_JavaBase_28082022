package com.hillel.somov.lessons.lesson5;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String team1;
        String team2;
        final int TOTAL = 5;  //Total gamers

        int g1t1 = -1;
        int g2t1 = -1;
        int g3t1 = -1;
        int g4t1 = -1;
        int g5t1 = -1;
        int g1t2 = -1;
        int g2t2 = -1;
        int g3t2 = -1;
        int g4t2 = -1;
        int g5t2 = -1;


        System.out.println("Enter name Team1: ");

        team1 = scanner.nextLine();
        System.out.println(team1);

        System.out.println("Enter amount FRAGs Gamer1 team " + team1);

        if (scanner.hasNextInt()) {
            g1t1 = scanner.nextInt();
            System.out.println("Frags Gamer1 from team " + team1 + " = " + g1t1);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer2 team " + team1);

        if (scanner.hasNextInt()) {
            g2t1 = scanner.nextInt();
            System.out.println("Frags Gamer2 from team " + team1 + " = " + g2t1);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer3 team " + team1);

        if (scanner.hasNextInt()) {
            g3t1 = scanner.nextInt();
            System.out.println("Frags Gamer3 from team " + team1 + " = " + g3t1);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer4 team " + team1);

        if (scanner.hasNextInt()) {
            g4t1 = scanner.nextInt();
            System.out.println("Frags Gamer4 from team " + team1 + " = " + g4t1);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer5 team " + team1);

        if (scanner.hasNextInt()) {
            g5t1 = scanner.nextInt();
            System.out.println("Frags Gamer5 from team " + team1 + " = " + g5t1);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Enter name Team2: ");

        team2 = scanner.nextLine();
        System.out.println(team2);

        System.out.println("Enter amount FRAGs Gamer1 team " + team2);

        if (scanner.hasNextInt()) {
            g1t2 = scanner.nextInt();
            System.out.println("Frags Gamer1 from team " + team1 + " = " + g1t1);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer2 team " + team2);

        if (scanner.hasNextInt()) {
            g2t2 = scanner.nextInt();
            System.out.println("Frags Gamer2 from team " + team2 + " = " + g2t2);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer3 team " + team2);

        if (scanner.hasNextInt()) {
            g3t2 = scanner.nextInt();
            System.out.println("Frags Gamer3 from team " + team2 + " = " + g3t2);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer4 team " + team2);

        if (scanner.hasNextInt()) {
            g4t2 = scanner.nextInt();
            System.out.println("Frags Gamer4 from team " + team2 + " = " + g4t2);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);
        }

        System.out.println("Enter amount FRAGs Gamer5 team " + team2);

        if (scanner.hasNextInt()) {
            g5t2 = scanner.nextInt();
            System.out.println("Frags Gamer5 from team " + team2 + " = " + g5t2);
        } else {
            System.out.println("Something went wrong, try again! The input data can only be an integer! ");
            System.exit(0);

        }
        scanner.nextLine();


        double totalTeam1 = (g1t1 + g2t1 + g3t1 + g4t1 + g5t1);
        double totalTeam2 = (g1t2 + g2t2 + g3t2 + g4t2 + g5t2);

        double scoreTeam1 = totalTeam1 / TOTAL;
        double scoreTeam2 = totalTeam2 / TOTAL;


        if (scoreTeam1 > scoreTeam2) {
            System.out.println("WINNER TEAM  " + team1 + " number of points = " + scoreTeam1);
        } else if (scoreTeam1 == scoreTeam2) {
            System.out.println("Dead heat! Both teams scored " + scoreTeam1);
        } else {
            System.out.println("WINNER TEAM  " + team2 + " number of points = " + scoreTeam2);
        }


    }


}




