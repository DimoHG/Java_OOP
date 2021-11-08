package com.softuni.InterfacesAndAbstraction.animals;

public class Cat extends Mammal{
    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void move() {
        System.out.println("walking");
    }

    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    void drinkMilk() {
        System.out.println("Cat is drinking milk");
    }
}
