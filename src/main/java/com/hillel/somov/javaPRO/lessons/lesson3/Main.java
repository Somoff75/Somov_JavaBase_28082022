package com.hillel.somov.javaPRO.lessons.lesson3;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Fedor");
        Cat cat3 = new Cat("LaLa");
        Dog dog1 = new Dog("Patron");
        Dog dog2 = new Dog("Buba");

        cat1.run(100);
        cat1.swim(10);
        cat2.run(300);
        cat3.run(110);
        dog1.run(400);
        dog1.swim(11);
        dog2.run(600);
        dog2.swim(4);

        System.out.println();
        System.out.println("Number of animals: " + Animals.counter);
        System.out.println("Number of dogs: " + Dog.counter);
        System.out.println("Number of cats: " + Cat.counter);

    }

}
