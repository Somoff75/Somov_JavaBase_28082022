package com.hillel.somov.lessons.lesson2_1;

public class Main {

    public static void main(String[] args) {

        char north = '\u004E';
        int degree = 55;
        char chDegree = '\u00B0';
        int minutes = 45;
        char chMinutes = '\u2032';
        char chZero = '\u0030';
        double seconds = 4.76;
        char chSeconds = '\u2033';

        String latitude = (north + "" + degree + chDegree + "" + minutes + chMinutes + "" + chZero + seconds + chSeconds);

        char east = '\u0045';
        int degree1 = 37;
        char chDegree1 = '\u00B0';
        int minutes1 = 37;
        char chMinutes1 = '\u2032';
        char chZero1 = '\u0030';
        double seconds1 = 3.33;
        char chSeconds1 = '\u2033';

        String longitude = (east + "" + degree1 + chDegree1 + "" + minutes1 + chMinutes1 + "" + chZero1 + seconds1 + chSeconds1);

        System.out.println("Place for missile attack: " + latitude + "  " + longitude);


    }
}