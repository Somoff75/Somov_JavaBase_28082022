package com.hillel.somov.javaPRO.lessons.HW13;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
