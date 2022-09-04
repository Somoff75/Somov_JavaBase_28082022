package com.hillel.somov.lessons.lesson2;

public class Main {

    public static void main(String[] args) {

        char north = '\u004E';
        int degree = 55;
        char chDegree = '\u00B0';
        int minutes = 45;
        char chMinutes = '\u2032';
        String seconds = "04,76";
        char chSeconds = '\u2033';

        char east = '\u0045';
        int degree1 = 37;
        char chDegree1 = '\u00B0';
        int minutes1 = 37;
        char chMinutes1 = '\u2032';
        String seconds1 = "03,33";
        char chSeconds1 = '\u2033';

        System.out.println("Place for missile attack: " + north + degree + chDegree + "" + minutes + chMinutes + "" + seconds + chSeconds + "  " + east + degree1 + chDegree1 + "" + minutes1 + chMinutes1 + "" + seconds1 + chSeconds1);

    }
}
