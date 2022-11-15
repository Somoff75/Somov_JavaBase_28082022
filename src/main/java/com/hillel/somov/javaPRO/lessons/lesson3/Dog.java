package com.hillel.somov.javaPRO.lessons.lesson3;

public class Dog extends Animals {
    static int counter = 0;

    public Dog(String name) {
        super(name);
        this.maxSwim = 10;
        this.maxRun = 500;
        this.type = "Dog";
        counter++;

    }

}

