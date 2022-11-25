package com.hillel.somov.javaPRO.lessons.lesson4.Square;

public class Triangle implements Figures {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getSquare() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        // TODO: 22.11.2022 используем формулу Герона для вычисления площади треугольника.
    }


}
