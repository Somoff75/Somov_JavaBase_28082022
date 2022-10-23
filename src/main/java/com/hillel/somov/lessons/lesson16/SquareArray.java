package com.hillel.somov.lessons.lesson16;

import java.util.Arrays;

public class SquareArray {
    private int row;
    private int column;
    private int[][] sqArray;

    public SquareArray(int row, int column) {
        this.row = row;
        this.column = column;
        this.sqArray = new int[row][column];
    }

    public SquareArray(int row) {
        this.row = row;
        this.column = row;
        this.sqArray = new int[row][column];
    }

    public SquareArray(int[][] sqArray) {
        this.sqArray = sqArray;
        this.row = this.sqArray.length;
        this.column = this.sqArray[0].length;
    }

    public SquareArray() {
        this.row = 2;
        this.column = this.row;
        this.sqArray = new int[row][column];
    }

    public long getArea() {return row * column;}

    public long getSumLengthAllRow() {
        long sum = 0;
        for (int[] row : sqArray)
            sum += row.length;
        return sum;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getSqArray() {
        return sqArray;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] someRow: sqArray)
            builder.append(Arrays.toString(someRow)).append('\n');
        return builder.toString();
    }
}
