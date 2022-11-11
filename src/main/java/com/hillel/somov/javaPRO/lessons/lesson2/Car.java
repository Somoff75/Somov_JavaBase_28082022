package com.hillel.somov.javaPRO.lessons.lesson2;

public class Car {

    String startElectricity = "Start electricity";
    String startCommand = "Start command";
    String startFuelSystem = "Start fuel system";


    public void start() {
        System.out.println(getStartElectricity());
        System.out.println(getStartCommand());
        System.out.println(getStartFuelSystem());
        System.out.println("All systems are ready. Car started.");

    }

    private String getStartElectricity() {
        return startElectricity;

    }

    private String getStartCommand() {

        return startCommand;
    }

    private String getStartFuelSystem() {

        return startFuelSystem;
    }

}
