package com.hillel.somov.lessons.lesson15;

import java.util.Arrays;
import java.util.Scanner;

import static com.hillel.somov.lessons.lesson15.Drinks.*;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        makeDrink();
    }

    static void makeDrink() {
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        double totalCost = 0;
        int counter = 0;

        System.out.println("Hello! I'm vending machine.");


        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Please chose your drinks from this list! " + Arrays.toString(drinksMachines));
            System.out.println("Or enter YES if you want to exit! ");

            while (true) {

                String userChoice = SCANNER.nextLine().toUpperCase();

                if (userChoice.equals("YES")) {
                    System.out.println("Take your drinks.");
                    System.out.println("Total price: " + totalCost);
                    System.out.println("Total drinks: " + counter);
                    System.out.println("See you later!");
                    System.exit(0);

                }

                for (DrinksMachine name : drinksMachines) {
                    if (userChoice.equals(name.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userChoice);
                        break;
                    }

                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Choose another.");
                }
            }

            switch (drinksMachine) {

                case COFFEE:
                    System.out.println("You order " + drinksMachine + " costs " + COFFEE_PRICE + " UAN. ");
                    totalCost += COFFEE_PRICE;
                    counter++;
                    break;

                case TEA:
                    System.out.println("You order " + drinksMachine + " costs " + TEA_PRICE + " UAN. ");
                    totalCost += TEA_PRICE;
                    counter++;
                    break;

                case MOJITO:
                    System.out.println("You order " + drinksMachine + " costs " + MOJITO_PRICE + " UAN. ");
                    totalCost += MOJITO_PRICE;
                    counter++;
                    break;

                case LEMONADE:
                    System.out.println("You order " + drinksMachine + " costs " + LEMONADE_PRICE + " UAN. ");
                    totalCost += LEMONADE_PRICE;
                    counter++;
                    break;

                case SPRING_WATER:
                    System.out.println("You order " + drinksMachine + " costs " + SPRING_WATER_PRICE + " UAN. ");
                    totalCost += SPRING_WATER_PRICE;
                    counter++;
                    break;

                case COCA_COLA:
                    System.out.println("You order " + drinksMachine + " costs " + COCA_COLA_PRICE + " UAN. ");
                    totalCost += COCA_COLA_PRICE;
                    counter++;
                    break;

            }
        }

    }
}




