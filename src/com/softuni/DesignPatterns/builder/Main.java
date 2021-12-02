package com.softuni.DesignPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza().withWeight(200).withName("Margaritta").withTopping("A");
        Pizza pizza2 = new Pizza().withWeight(200).withName("Margaritta").withTopping("A");

    }
}
