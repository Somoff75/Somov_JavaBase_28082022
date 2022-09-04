package com.hillel.somov.lessons.lesson3;

public class VolumeParallelepiped {

    public static void main(String[] args) {

        int length = 10;
        int height = 13;
        int width = 5;

        int volume = length * height * width;

        int lengthTotal = 4 * length + 4 * height + 4 * width;

        System.out.println("Volume of parallelepiped = "  + volume + " cm3");
        System.out.println("Length of all edges of the parallelepiped = "  + lengthTotal + " cm");


    }
}
