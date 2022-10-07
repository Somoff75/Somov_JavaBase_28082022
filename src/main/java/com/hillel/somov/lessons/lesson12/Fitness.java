package com.hillel.somov.lessons.lesson12;

public class Fitness {

    public static void main(String[] args) {
        new Account("Petro", 5, 7, 1998, "petro@ukr.net", "+38 067 233 33 33", "Piatochkin", 80, 90, 15000).printAccountInfo();
        new Account("Oleg", 23, 12, 1985, "oleg@gmail.com", "+38 066 455 55 33", "Babajak", 78, 95, 18500).printAccountInfo();
        new Account("Ivan", 14,5,1984,"ivan@ukr.net", "+38 063 564 62 63","Pupkin", 85,85,11222).printAccountInfo();

        Account olga = new Account("Olga", 30, 3, 2000, "olga@i.ua", "+38 050 386 86 86", "Bubachka", 70, 88, 14000);
        olga.printAccountInfo();
        olga.setSurname("Bubka");
        olga.setWeight(55);
        olga.setPressure(95);
        olga.setStepsByDay(30000);
        olga.printAccountInfo();

        Account vasil = new Account("Vasil", 3, 12,1999,"vasil@gmail.com", "+38 095 245 66 99","Gonta",85,90,5000);
        vasil.printAccountInfo();
        vasil.setSurname("Gonchar");
        vasil.setWeight(75);
        vasil.setPressure(80);
        vasil.setStepsByDay(14500);
        vasil.printAccountInfo();

    }
}
