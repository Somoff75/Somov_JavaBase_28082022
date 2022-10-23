package com.hillel.somov.lessons.lesson16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AverageArray {

    public AverageArray(int size, int range) {

        double average = 0;
        int[] mas = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            mas[i] = random.nextInt(range) - 1;
        }
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < size; i++) {
            average += mas[i];
        }
        average /= size;
        System.out.println("The arithmetic mean of the array: " + average);
    }
    @Override
    public String toString(){
        Scanner scanner = new Scanner(System.in);
        return String.valueOf(scanner);
    }

}
