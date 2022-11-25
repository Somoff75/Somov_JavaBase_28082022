package com.hillel.somov.javaPRO.lessons.lesson4.MemberAll;

public class Member implements Run, Jump {
    private final String name;
    int run;
    int jump;
    public Member(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public String getName() {
        return name;
    }
    public int getMaxRun() {
        return run;
    }
    public int getMaxJump() {
        return jump;
    }
    @Override
    public void run() {
    }

    @Override
    public void jump() {

    }
}

