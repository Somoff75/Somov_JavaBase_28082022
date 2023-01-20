package com.hillel.somov.javaPRO.lessons.HW14;

public class FindWord {

    public static void main(String[] args) {
        String text = "To be, or not to be, that is the question:\n" +
                      "Whether ’tis nobler in the mind to suffer\n" +
                      "The slings and arrows of outrageous fortune,\n" +
                      "Or to take arms against a sea of troubles\n" +
                      "And by opposing end them. ";

        String symbol = "o";
        System.out.println("Symbol _" + symbol + "_ found " + findSymbolOccurance(text, symbol) + " times.");


        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apple", "Plant"));

        System.out.println(stringReverse("Java"));

        System.out.println(isPalindrome("asddsa"));

        System.out.println(isPalindrome("Adidas"));
    }


    public static int findSymbolOccurance(String str, String symbol) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(symbol)) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        int position = -1;
        for (int i = 0; i < source.length(); i++) {
            if (source.startsWith(target, i)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static String stringReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        boolean result = false;
        String reverse = stringReverse(str);
        if (reverse.equals(str)) {
            result = true;
        }
        return result;
    }
}
