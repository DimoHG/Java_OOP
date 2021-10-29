package com.softuni.Abstraction;

public enum Seasons {
    SUMMER("Summer", 25, "July", "August"),
    WINTER("Winter", 5, "December"),
    SPRING("Spring", 15, "May"),
    AUTUMN("Autumn", 15, "September");

    Seasons(String name, double averageTemperature, String... months) {
        this.months = months;
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public enum Temperature {
        COLD, WARM, MILD
    }

    public void printNameAndTemperature(){
        System.out.println(this.name + " " + this.averageTemperature);
    }

    public String[] getMonths() {
        return months;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    private String[] months;
    private String name;
    private double averageTemperature;
    private Temperature temperature;
}
