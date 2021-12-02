package com.softuni.DesignPatterns.strategy.fly;

public class FlyNearBeach implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Fly by the beach");
    }
}
