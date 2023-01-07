package com.hillel.somov.javaPRO.lessons.lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    static Map<Optional<Product>, Optional<Company>> products = new HashMap<>();
    public static void main(String[] args) throws Exception {

        Optional <Product> product1 = Optional.of(new Product("IPhone",1400));
        Optional <Product> product2 = Optional.of(new Product("Samsung A2", 400));
        Optional <Product> product3 = Optional.of(new Product("Tesla Model S", 80000));

        Optional<Company> company1 = Optional.of(new Company("Apple"));
        Optional<Company> company2 = Optional.of(new Company("Samsung"));
        Optional<Company> company3 = Optional.of(new Company("Tesla"));


        products.put(product1, company1);
        products.put(product2, company2);
        products.put(product3, company3);

        System.out.println(findPriceByProduct("IPhone").get().price);
        System.out.println(findPriceByProduct("Samsung A2").get().price);
        System.out.println(findPriceByProduct("Tesla Model S").get().price);
        System.out.println();
        System.out.println(findCompanyByProduct("IPhone").get().getName());
        System.out.println(findCompanyByProduct("Samsung A2").get().getName());
        System.out.println(findCompanyByProduct("Tesla Model S").get().getName());
        System.out.println();
        System.out.println(findProductByCompany("Apple").get().name);
        System.out.println(findProductByCompany("Samsung").get().name);
        System.out.println(findProductByCompany("Tesla").get().name);

    }
    private static Optional<Company> findCompanyByProduct(String name) {
        for (Map.Entry<Optional<Product>, Optional<Company>> entry : products.entrySet()) {
            if (entry.getKey().get().name.equals(name)) {
                return entry.getValue();
            }
        }
        return Optional.empty();
    }

    public static Optional<Product> findPriceByProduct(String name){
        for (Map.Entry<Optional<Product>, Optional<Company>> entry : products.entrySet()) {
            if (entry.getKey().get().name.equals(name)) {
                return entry.getKey();
            }
        }
        return Optional.empty();
    }
    public static Optional<Product> findProductByCompany(String name){
        for (Map.Entry<Optional<Product>, Optional<Company>> entry : products.entrySet()) {
            if (entry.getValue().get().getName().equals(name)) {
                return entry.getKey();
            }
        }
        return Optional.empty();
    }

}
