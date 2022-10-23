package com.hillel.somov.lessons.lesson16;

public class Square {

    private final int[][] matrix;

    public Square (int col, int row) {
        this.matrix = new int[row][col];

        int x = 0;
        for (int i = 0; i < matrix.length; i++)
            if (matrix.length != matrix[i].length) {
                System.out.println("Not a Square!");
                x = 1;
                break;
            }
        if (x == 0) {
            System.out.println("It is a Square");

        }
    }
}
