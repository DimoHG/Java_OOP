package com.softuni.DesignPatterns.factory;

public abstract class Pizza {
    public double diameter;

    public Pizza(double diameter) {
        this.diameter = diameter;
    }

    abstract public void prepare();
    abstract public void bake();
    abstract public void box();

}
