package com.hillel.somov.javaPRO.lessons.lesson4.Square;

public class Circle implements Figures {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        double PI = 3.14159265359;
        return PI * (radius * radius);
        // TODO: 22.11.2022  или можно так --- return Math.PI * (radius * radius);
    }

}

