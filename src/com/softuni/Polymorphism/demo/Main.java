package com.softuni.Polymorphism.demo;

public class Main {
    public static void main(String[] args) {

        Singer mySinger = new RockSinger();

        if(mySinger instanceof OperaSinger){

            OperaSinger singer = (OperaSinger) mySinger;
        }

    }
}
