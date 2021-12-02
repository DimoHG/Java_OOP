package com.softuni.DesignPatterns.strategy.fly;

public class FlyHigh implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
}
