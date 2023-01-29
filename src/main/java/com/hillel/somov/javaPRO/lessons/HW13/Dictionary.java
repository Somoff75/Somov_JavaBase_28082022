package com.hillel.somov.javaPRO.lessons.HW13;

import java.util.List;
import java.util.Map;

public class Dictionary {
    private final Map<ProductType, List<Product>> products;

    public Dictionary(Map<ProductType, List<Product>> products) {

        this.products = products;
    }

    @Override
    public String toString() {
        return "Dictionary{" + '\n' +
                "products=" + products + '\n' +
                '}';
    }
}
