package com.hillel.somov.javaPRO.lessons.lesson8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {


        Cafe cafe1 = new Cafe("SeaMan", "Port str, 11", 10);
        Cafe cafe2 = new Cafe("Crazy Dwarf", "Forest str, 1", 20);
        Cafe cafe3 = new Cafe("Dwarf1", "Forest str, 10", 20);
        Cafe cafe4 = new Cafe("Crazy Bar", "Wilanowska str, 2", 34);
        Cafe cafe5 = new Cafe("Bar2", "Botanichna str, 22", 44);


        List<Cafe> cafeList = new ArrayList<>();

        cafeList.add(cafe1);
        cafeList.add(cafe2);
        cafeList.add(cafe3);
        cafeList.add(cafe4);
        cafeList.add(cafe5);

        System.out.println(findFirst(cafeList));
        System.out.println();
        System.out.println(findLast(cafeList));
        System.out.println();
        System.out.println(findByAddressWords(cafeList, "Forest"));
        System.out.println();
        System.out.println(findByNameWords(cafeList, "Bar"));
        System.out.println();
        System.out.println(findByNameWords(cafeList, "Crazy"));
        System.out.println(findByNameWords(cafeList, "fffr"));

    }

    public static List<Cafe> findByAddressWords(List<Cafe> cafeList, String word) throws Exception {
        List<Cafe> result = new ArrayList<>();
        for (Cafe cafe : cafeList) {
            if (cafe.getAddress().contains(word)) {
                result.add(cafe);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("No such word in address");
        }
        return result;
    }

    public static List<Cafe> findByNameWords(List<Cafe> cafeList, String word) throws Exception {
        List<Cafe> result = new ArrayList<>();
        for (Cafe cafe : cafeList) {
            if (cafe.getName().contains(word)) {
                result.add(cafe);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("No such word in name");
        }
        return result;
    }

    public static String findFirst(List<Cafe> cafeList) throws Exception {
        try {
            checkIsEmpty(cafeList);
            Cafe returnCafe = (Cafe) cafeList.get(0);
            System.out.println("Collection is not empty");
            return "First cafe - " + returnCafe;
        } catch (Exception e) {
            throw new Exception("Collection is empty");
        }
    }

    public static String findLast(List<Cafe> cafeList) throws Exception {
        try {
            checkIsEmpty(cafeList);
            Cafe returnCafe = (Cafe) cafeList.get(cafeList.size() - 1);
            System.out.println("Collection is not empty");
            return "Last cafe - " + returnCafe;
        } catch (Exception e) {
            throw new Exception("Collection is empty");
        }
    }

    public static boolean checkIsEmpty(List<Cafe> cafeList) {
        Iterator<Cafe> itr = cafeList.iterator();
        boolean check = itr.hasNext();
        return check;
    }

}




