package com.softuni.DesignPatterns.strategy;

import com.softuni.DesignPatterns.strategy.fly.CantFly;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(new CantFly());
        eagle.fly();


        eagle.fly();

        eagle.fly();

    }
}
