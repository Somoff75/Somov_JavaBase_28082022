package com.hillel.somov.javaPRO.lessons.lesson4.Square;

public class Main {

    public static void main(String[] args) {

        Figures[] figures = {

                new Triangle(3, 4, 5),
                new Triangle(5, 4, 6),
                new Circle(2.5),
                new Circle(3.5),
                new Square(6),
                new Square(7)
        };

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Square of figure " + i + " is: " + figures[i].getSquare() + " cm2");
        }

        double sum = 0;
        for (Figures figure : figures) {
            sum += figure.getSquare();

        }
        System.out.println();
        System.out.println("Total square of all figures are: " + sum + " cm2");

    }
}