package com.hillel.somov.javaPRO.lessons.HW13;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(ProductType.BOOK, 150, false, LocalDate.of(2018, 10, 1)),
                new Product(ProductType.GAME, 100, false, LocalDate.of(2017, 12, 5)),
                new Product(ProductType.MUSIC, 300, true, LocalDate.of(2021, 11, 22)),
                new Product(ProductType.BOOK, 500, true, LocalDate.of(2022, 9, 11)),
                new Product(ProductType.BOOK, 260, true, LocalDate.of(2022, 11, 23)),
                new Product(ProductType.GAME, 700, false, LocalDate.of(2021, 12, 4)),
                new Product(ProductType.MUSIC, 150, true, LocalDate.of(2020, 4, 2)),
                new Product(ProductType.MUSIC, 50, true, LocalDate.of(2022, 3, 30)),
                new Product(ProductType.BOOK, 60, false, LocalDate.of(2023, 1, 7)),
                new Product(ProductType.BOOK, 58, true, LocalDate.of(2023, 1, 21)),
                new Product(ProductType.GAME, 75, false, LocalDate.of(2021, 12, 4)),
                new Product(ProductType.BOOK, 50, false, LocalDate.of(2023, 1, 11))
        );
        Catalogue catalogue = new Catalogue(products);

        System.out.println("Books has price > 250.");
        List<Product> saleBooks = catalogue.getBooksOver250();
        for (Product book : saleBooks) {
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Books has discount: ");
        List<Product> discountBooks = catalogue.getDiscountBooks();
        for (Product book : discountBooks) {
            System.out.println(book);
        }
        System.out.println();
        System.out.println("The cheapest book in catalogue. ");
        Product theCheapest = catalogue.getTheCheapestBook(ProductType.BOOK);
        System.out.println(theCheapest);
        System.out.println();

        System.out.println("The three most recently added products. ");
        List<Product> theLatest = catalogue.getTheLatestProducts();
        for (Product product : theLatest) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println("The cost of books at this year's prices <= 75.");
        float calculatedBooks = catalogue.getThisYearBooksUnder75();
        System.out.println("Total: " + calculatedBooks);
        System.out.println();

        System.out.println("Grouping catalogue by type.");
        Dictionary group = catalogue.groupByType();
        System.out.println(group);
    }

}


