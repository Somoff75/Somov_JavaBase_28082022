package com.hillel.somov.javaPRO.lessons.lesson6;

public class ArrayException {
    static class UserException extends Exception {
        UserException(String message) {
            super(message);
        }
    }

    static class ArrayDataException extends UserException {
        ArrayDataException(int row, int col) {
            super(String.format("Wrong data is in the cell |" + row + " , " + col + "|"));
        }
    }

    static class ArraySizeException extends UserException {
        ArraySizeException() {
            super("The size of the array should be |4 x 4|");
        }
    }

    static class Calculator {
        static int doCalc(String[][] strArray)
                throws ArraySizeException, ArrayDataException {

            int sum = 0;

            if (4 != strArray.length) throw new ArraySizeException();
            for (int i = 0; i < strArray.length; i++) {
                if (4 != strArray[i].length) throw new ArraySizeException();
                for (int j = 0; j < strArray[i].length; j++) {
                    try {
                        sum += Integer.parseInt(strArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException(i, j);
                    }
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {

        String[][] correctMatrix = {
                {"5", "15", "2", "3"},
                {"6", "1", "8", "0"},
                {"5", "5", "4", "1"},
                {"7", "3", "0", "2"}
        };
        String[][] wrongMatrix = {
                {"5", "3", "4", "0"},
                {"6", "4", "1", "4"},
                {"4", "6", "5",},
                {"1", "5"}
        };
        String[][] charMatrix = {
                {"3", "3", "T", "1"},
                {"4", "3", "9", "6"},
                {"3", "6", "8", "7"},
                {"5", "0", "6", "0"}
        };

        try {
            System.out.println("Matrix 1:");
            System.out.println("The sum of all array elements is " + Calculator.doCalc(correctMatrix) + ".");
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Matrix 2:");
            System.out.println("The sum of all array elements is " + Calculator.doCalc(wrongMatrix) + ".");
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Matrix 3:");
            System.out.println("The sum of all array elements is " + Calculator.doCalc(charMatrix) + ".");
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }

    }
}
