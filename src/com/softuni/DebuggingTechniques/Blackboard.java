package com.softuni.DebuggingTechniques;

public class Blackboard {
    private final static int PEOPLE_IN_CLASS = 12;

    public static void main(String[] args) {
        int a = 5;
        int sum = Summarizer.sum(5, 5);
        System.out.println(sum);
        System.out.println();


    }

    static int sum() {
        int a = getA();
        int b = getA();
        return a + b;
    }

    static int getA() {
        return 10;
    }

    static int getB() {
        return PEOPLE_IN_CLASS;
    }
}
