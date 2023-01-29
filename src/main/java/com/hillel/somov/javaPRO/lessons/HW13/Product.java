package com.hillel.somov.javaPRO.lessons.HW13;

import java.time.LocalDate;
import java.util.UUID;

public class Product {
    private static final int DISCOUNT = 10;
    private final ProductType type;
    private int price;
    private final boolean isDiscounted;
    private final LocalDate date;
    private final UUID id;

    public ProductType getType() {

        return type;
    }

    public float getPrice() {

        return price;
    }

    public boolean isDiscounted() {

        return isDiscounted;
    }
    public LocalDate getDate() {
        return date;
    }
    public Product(ProductType type, int price, boolean isDiscounted, LocalDate date) {
        this.type = type;
        this.price = price;
        this.isDiscounted = isDiscounted;
        this.date = date;
        id = UUID.randomUUID();
    }
    public void applyDiscount() {
        price -= price * DISCOUNT / 100;
    }
    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", price=" + price +
                ", isDiscounted=" + isDiscounted +
                ", date=" + date +
                ", id=" + id + "\n" +
                '}';
    }
}
