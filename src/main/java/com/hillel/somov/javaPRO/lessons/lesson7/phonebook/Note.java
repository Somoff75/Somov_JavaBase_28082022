package com.hillel.somov.javaPRO.lessons.lesson7.phonebook;

public class Note extends PhoneDirectory {
    private String name;
    private String phone;
    private String phone2;

    public Note(String name, String phone, String phone2) {
        super();
        this.name = name;
        this.phone = phone;
        this.phone2 = phone2;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone + phone2;
    }
    @Override
    public String toString() {
        return "Name |" + name + " " +
                "phone " + phone + " " + phone2 + "|" + "\n";
    }
}
