package com.softuni.SOLID.interfaces;

public interface File {

    int getSize();
    boolean write(String text);
    void append(String text);
}
