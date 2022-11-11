package com.hillel.somov.javaPRO.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", "Marley", 33, "Musician", 2000);
        employee.printEmployee();

        Car car = new Car();
        car.start();
    }
}
