package com.hillel.somov.javaPRO.lessons.lesson7;


import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void calcOccurrence(List<String> list3) {
        List<String> listResult = new ArrayList<>();
        for (String listElement : list3) {
            if (!listResult.contains(listElement)) {
                listResult.add(listElement);
            }
        }
        for (String listResultElement : listResult) {
            int count = 0;
            for (String listElement : list3) {
                if (listResultElement.equals(listElement)) {
                    count++;
                }
            }
            System.out.println("Word '" + listResultElement + "' - occurs " + count + " times");
        }
    }

    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T t : array) {
            list.add(t);
        }
        return list;
    }

    public static String countOccurrence(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        System.out.println();
        return "Word " + "'" + word + "' occurs " + " " + count + " times \n";
    }

    public static List<Integer> findUnique(List<Integer> list2) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < list2.size(); i++) {
            if (!result.contains(list2.get(i))) {
                result.add(list2.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Method toList");

        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array " + toList(array));
        List<Integer> integerList = toList(array);
        System.out.println("List " + integerList + "\n");


        System.out.println("Method countOccurrence");

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("apple");
        list.add("three");
        list.add("four");
        list.add("airplane");
        list.add("six");
        list.add("seven");
        list.add("three");
        list.add("nine");
        list.add("cat");
        list.add("one");
        list.add("dog");
        list.add("three");
        list.add("four");
        list.add("free");

        System.out.println(countOccurrence(list, "three"));

        System.out.println("Method findUnique");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(5);
        list2.add(6);
        list2.add(6);
        list2.add(3);
        list2.add(7);
        list2.add(8);
        list2.add(10);
        list2.add(10);
        list2.add(23);
        list2.add(45);

        System.out.println("All list - " + list2);
        System.out.println("Unique number - " + findUnique(list2) + "\n");


        System.out.println("Method calcOccurrence");

        List<String> list3 = new ArrayList<>();
        list3.add("free");
        list3.add("cat");
        list3.add("dog");
        list3.add("cool");
        list3.add("dog");
        list3.add("free");
        list3.add("free");
        list3.add("cat");
        list3.add("three");
        list3.add("four");
        list3.add("five");
        list3.add("free");
        list3.add("free");
        list3.add("dog");
        list3.add("five");
        list3.add("cat");
        list3.add("free");
        list3.add("free");
        list3.add("cat");

        calcOccurrence(list3);

    }
}

 
