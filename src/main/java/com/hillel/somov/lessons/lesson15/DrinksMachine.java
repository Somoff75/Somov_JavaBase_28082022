package com.hillel.somov.lessons.lesson15;

public enum DrinksMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    SPRING_WATER("Spring water"),
    COCA_COLA("Coca-Cola");

    private final String  name;

    DrinksMachine(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }


}
