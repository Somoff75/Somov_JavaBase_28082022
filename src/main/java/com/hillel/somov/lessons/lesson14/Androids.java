package com.hillel.somov.lessons.lesson14;

import com.hillel.somov.lessons.lesson14.interfaces.LinuxOS;
import com.hillel.somov.lessons.lesson14.interfaces.Smartphones;

public class Androids implements Smartphones, LinuxOS {
    public String name;

    public Androids(String name) {
        this.name = name;
        System.out.println("Hello! I'm " + this.name + ".");
    }

    @Override
    public void linuxOS() {
        System.out.println("I working on Android. ");
    }

    @Override
    public void call() {
        System.out.println("I can call. ");
    }

    @Override
    public void sms() {
        System.out.println("I can send SMS.");
    }

    @Override
    public void internet() {
        System.out.println("And, I can connect to the internet.");
    }

}
