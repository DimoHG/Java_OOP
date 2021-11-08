package com.softuni.InterfacesAndAbstraction.animals;

public abstract class Mammal implements Animal {
    private String name;
    private int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void breathe(){
        System.out.println("Breathe with lungs");
    }

    void drinkMilk(){
        System.out.println("Drinking Milk");
    };

}
