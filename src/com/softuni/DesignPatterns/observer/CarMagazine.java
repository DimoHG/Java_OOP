package com.softuni.DesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CarMagazine implements Subject {
    List<Observer> observers;

    public CarMagazine() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String text) {
        observers.forEach(observer -> observer.update(text));
    }
}
