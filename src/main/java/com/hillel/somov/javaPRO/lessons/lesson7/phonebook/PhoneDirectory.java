package com.hillel.somov.javaPRO.lessons.lesson7.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private List<Note> noteList;
    public PhoneDirectory() {
        this.noteList = new ArrayList<>();
    }
    public void addNote(Note note) {
        noteList.add(note);
    }
    public String findNumberByName(String name) {
        String result = "";
        for (Note note : noteList) {
            if (note.getName().equals(name)) {
                result = note.getPhone();
                return result + "\n";
                }else {
                result = "No such name in the phone book \n";
            }
        }
        return result + "\n";
    }
    public String findNameByNumber(String phone) {
        String result = "";
        for (Note note : noteList) {
            if (note.getPhone().equals(phone)) {
                result = note.getName();
                return result + "\n";
            } else{
                return "Number not found \n";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "PhoneDirectory " + noteList + "\n";
    }

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addNote(new Note("Petro", "+380504455555", ""));
        phoneDirectory.addNote(new Note("Vasilii", "+380679996652", "+380662255588"));
        phoneDirectory.addNote(new Note("Andrii", "+380504455566", "+380735554477"));
        phoneDirectory.addNote(new Note("Ivan", "+485175556666", ""));


        System.out.println(phoneDirectory.findNameByNumber("1212"));
        System.out.println(phoneDirectory.findNameByNumber("+380504455555"));
        System.out.println(phoneDirectory.findNumberByName("Andrii"));
        System.out.println(phoneDirectory.findNumberByName("SSSS"));
        System.out.println(phoneDirectory);

    }

}