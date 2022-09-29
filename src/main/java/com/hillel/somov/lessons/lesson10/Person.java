package com.hillel.somov.lessons.lesson10;

public class Person {

    public static void main(String[] args) {

        String name1 = "Ostap";
        String name2 = "Vasil";
        String name3 = "Barbra";
        String surname1 = "Bender";
        String surname2 = "Pupkin";
        String surname3 = "Streisand";
        String city1 = "Odesa";
        String city2 = "Berdychiv";
        String city3 = "Atlanta";
        String phoneNumber1 = "380507777771";
        String phoneNumber2 = "380734541213";
        String phoneNumber3 = "+12455556699";

        personInfo(name1, surname1, city1, phoneNumber1);
        System.out.println();
        personInfo(name2, surname2, city2, phoneNumber2);
        System.out.println();
        personInfo(name3, surname3, city3, phoneNumber3);

    }

    static void personInfo(String name, String surname, String city, String phoneNumber) {
        System.out.print("Зателефонувати громадянинові " + name + " " + surname + ", з міста " + city + ", можна за номером: " + phoneNumber + ".");

    }

}
