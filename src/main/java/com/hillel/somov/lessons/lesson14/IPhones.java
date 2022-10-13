package com.hillel.somov.lessons.lesson14;

import com.hillel.somov.lessons.lesson14.interfaces.IOS;
import com.hillel.somov.lessons.lesson14.interfaces.Smartphones;

public class IPhones implements Smartphones, IOS {

    public String name;

    public IPhones(String name) {
        this.name = name;
        System.out.println("Hello! I'm " + this.name + ".");
    }

    @Override
    public void iOS() {
        System.out.println("I working on iOS. My system better than Android ;).");

    }

    @Override
    public void call() {
        System.out.println("I can call. ");

    }

    @Override
    public void sms() {
        System.out.println("I also can send SMS.");

    }

    @Override
    public void internet() {
        System.out.println("And, I can connect to the internet faster.");

    }
}
