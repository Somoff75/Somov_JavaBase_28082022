package com.hillel.somov.lessons.lesson11;

public class BurgerMain {

    public static void main(String[] args) {

        Burger burger = new Burger();
        System.out.println();
        Burger dietBurger = new Burger("Дієтичний бургер.");
        System.out.println();
        Burger doubleBurger = new Burger("Бургер з подвійним м'ясом.", 2);

    }

}
