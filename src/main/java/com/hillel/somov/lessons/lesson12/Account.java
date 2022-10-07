package com.hillel.somov.lessons.lesson12;

public class Account {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phone;

    private String surname;
    private int weight;
    private int pressure;
    private int daySteps;
    private final int age;


    Account(String name, int day, int month,
            int year, String email, String phone,
            String surname, int weight, int pressure, int daySteps) {

        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.daySteps = daySteps;
        this.age = 2020 - year;
    }

    public String getName() {
        return this.name;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getPressure() {
        return this.pressure;
    }
    public int getDaySteps() {
        return this.daySteps;
    }
    public int getAge() {
        return this.age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setStepsByDay(int daySteps) {
        this.daySteps = daySteps;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccountInfo:\n" +
                "name " + this.name + "\n" +
                "day " + this.day + "\n" +
                "month " + this.month + "\n" +
                "year " + this.year + "\n" +
                "email " + this.email + "\n" +
                "phone " + this.phone + "\n" +
                "surname " + this.surname + "\n" +
                "weight " + this.weight + "\n" +
                "pressure " + this.pressure + "\n" +
                "daySteps " + this.daySteps + "\n" +
                "age " + this.age + "\n";
    }


}
