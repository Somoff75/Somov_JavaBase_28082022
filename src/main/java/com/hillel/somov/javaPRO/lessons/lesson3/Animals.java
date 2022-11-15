package com.hillel.somov.javaPRO.lessons.lesson3;

public abstract class Animals {
    protected String type;

    protected String name;
    protected int maxRun;
    protected int maxSwim;
    static int counter = 0;


    public Animals(String name) {
        this.name = name;
        counter++;
    }

    public void run(int run) {

        if (this.maxRun >= run) {
            System.out.println(this.type + " " + this.name + " run " + run + " meters.");
        } else {
            System.out.println(this.type + " " + this.name + "  can't run this distance! Can run only - " + this.maxRun + " meters.");
        }

    }

    public void  swim (int swim) {

        if (this.maxSwim >= swim) {
            System.out.println(this.type + " " + this.name + " swim " + swim + " meters.");
        } else {
            System.out.println(this.type + " " + this.name + " can't swim this distance! Can swim only - " + this.maxSwim + " meters.");
        }
    }

}
