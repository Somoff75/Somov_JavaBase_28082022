package com.hillel.somov.lessons.lesson14;

public class Main {

    public static void main(String[] args) {

        Androids android = new Androids("Nokia");

        android.linuxOS();
        android.call();
        android.sms();
        android.internet();

        System.out.println();

        IPhones iPhone = new IPhones("14 PRO");
        iPhone.iOS();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();

    }

}
