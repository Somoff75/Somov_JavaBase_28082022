package com.hillel.somov.javaPRO.lessons.lesson8;

public class Cafe {
    private String name;
    private String address;
    private int drinks;

    public Cafe(String name, String address, int drinks) {
        this.name = name;
        this.address = address;
        this.drinks = drinks;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", drinks=" + drinks +
                '}';
    }

}
