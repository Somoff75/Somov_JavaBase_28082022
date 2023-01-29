package com.hillel.somov.javaPRO.lessons.HW13;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Catalogue {
    private final List<Product> products;
    public Catalogue(List<Product> products) {

        this.products = products;
    }
    public List<Product> getBooksOver250() {
        return products.stream()
                .filter(p -> p.getType() == ProductType.BOOK && p.getPrice() > 250)
                .collect(Collectors.toList());
    }
    public List<Product> getDiscountBooks() {
        return products.stream()
                .filter(p -> p.getType() == ProductType.BOOK && p.isDiscounted())
                .peek(Product::applyDiscount)
                .collect(Collectors.toList());
    }
    public Product getTheCheapestBook(ProductType type) {
        return products.stream()
                .filter(p -> p.getType() == type)
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new ProductNotFoundException("Product " + type + " not found."));
    }
    public List<Product> getTheLatestProducts() {
        return products.stream()
                .sorted((p1, p2) -> p2.getDate().compareTo(p1.getDate()))
                .limit(3)
                .collect(Collectors.toList());
    }
    public float getThisYearBooksUnder75() {
        return products.stream()
                .filter(p -> p.getType() == ProductType.BOOK
                        && p.getDate().getYear() == LocalDate.now().getYear()
                        && p.getPrice() <= 75)
                .map(Product::getPrice)
                .reduce(0f, Float::sum);
    }
    public Dictionary groupByType() {
        return new Dictionary(products.stream()
                .collect(Collectors.groupingBy(Product::getType)));
    }
}
