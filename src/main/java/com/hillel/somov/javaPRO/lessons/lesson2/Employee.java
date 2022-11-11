package com.hillel.somov.javaPRO.lessons.lesson2;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private String position;
    private String email;
    private int salary;

    public Employee(String name, String surname, int age, String position, int salary, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printEmployee() {
        System.out.println("Name: " + name + " Surname: " + surname + " Age: " + age + " Position: " + position + " Salary: " + salary + " Email: " + email);
    }
}

