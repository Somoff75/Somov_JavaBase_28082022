package com.hillel.somov.lessons.lesson10;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phoneNumber;

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Ostap";
        person1.surname = "Bender";
        person1.city = "Odesa";
        person1.phoneNumber = "380507777771";

        Person person2 = new Person();
        person2.name = "Vasil";
        person2.surname = "Pupkin";
        person2.city = "Berdychiv";
        person2.phoneNumber = "380734541213";

        Person person3 = new Person();
        person3.name = "Barbra";
        person3.surname = "Streisand";
        person3.city = "Atlanta";
        person3.phoneNumber = "+12455556699";


        String sentence = person1.personInfo();
        System.out.println(sentence);
        System.out.println();
        sentence = person2.personInfo();
        System.out.println(sentence);
        System.out.println();
        sentence = person3.personInfo();
        System.out.println(sentence);

    }

    String personInfo() {
        return "Зателефонувати громадянинові " + name + " " + surname + ", з міста " + city + ", можна за номером: " + phoneNumber;
    }


}
