package com.hillel.somov.javaPRO.lessons.HW14;

public class Game {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple ", "pumpkin", "potato"};

        String word = words[(int) (Math.random() * words.length)];
        String guess = "";
        String stars = "************";
        int count = 0;
        System.out.println("Guess the word!");
        while (true) {
            System.out.println("Enter your guess:");
            guess = new java.util.Scanner(System.in).nextLine();
            if (guess.equals(word)) {
                System.out.println("You guessed the word!");
                break;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(i)) {
                        stars = stars.substring(0, i) + word.charAt(i) + stars.substring(i + 1);
                    }
                }
                System.out.println(stars);
                count++;
            }

        }

    }
}
