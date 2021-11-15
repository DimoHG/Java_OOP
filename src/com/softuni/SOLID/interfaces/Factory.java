package com.softuni.SOLID.interfaces;

public interface Factory<T> {
    T produce(String input);
}
