package com.hillel.somov.javaPRO.lessons.lesson3;

public class Cat extends Animals {
    static int counter = 0;

    public  Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Cat";
        counter++;
    }

    @Override
    public void swim (int swim) {
        System.out.println("Cat's can't swim");
    }

}
