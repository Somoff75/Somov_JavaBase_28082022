package com.hillel.somov.javaPRO.lessons.lesson4.Square;

public class Square implements Figures {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

}

