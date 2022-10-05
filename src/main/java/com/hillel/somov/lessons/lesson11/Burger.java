package com.hillel.somov.lessons.lesson11;

public class Burger {
    String bun= "Булка";
    String meat = "М'ясо";
    String cheese = "Сир";
    String salad = "Салат";
    String mayonnaise = "Майонез" ;
    String burger;
    String dietBurger;
    String doubleBurger;


    public Burger() {

        this.burger = "Звичайний бургер.";

        System.out.println(burger);
        System.out.println("Склад:  " + bun + ", " + meat + ", " + cheese + ", " + salad + ", " + mayonnaise);

    }

    public Burger(String dietBurger) {

        this.dietBurger = "Дієтичний бургер.";

        System.out.println(dietBurger);
        System.out.println("Склад:  " + bun + ", " + meat + ", " + cheese + ", " + salad);
    }

    public Burger(String doubleBurger, int doubleMeat) {

        this.doubleBurger = "Бургер з подвійним м'ясом.";

        if (doubleMeat == 2) {
            System.out.println(doubleBurger);
        } else {
            System.out.println("Кількість м'яса повинна бути 2");
            System.exit(0);
        }

        System.out.println("Склад:  " + bun + ", " + meat + " * " + doubleMeat + ", " + cheese + ", " + salad + ", " + mayonnaise);

    }

}
