package com.hillel.somov.lessons.lesson4;

public class Homework4 {

    public static void main(String[] args) {

        final int TOTAL = 860;
        final double COEF = 1.5;

        int attackWarLi = 13;
        int attackArchLi = 24;
        int attackRiderLi = 46;

        int attackWarMin = 93;
        int attackArchMin = 35;
        int attackRiderMin = 12;

        double totalRateLi = TOTAL * (attackWarLi + attackArchLi + attackRiderLi);

        double totalRateMin = TOTAL * (attackWarMin + attackArchMin + attackRiderMin) * COEF;

        System.out.println("Total attack rate Li's army are: " + totalRateLi);
        System.out.println("Total attack rate Min's army are: " + totalRateMin);


    }
}
