package com.softuni.Abstraction;

import java.util.Arrays;

public class Season {
    private String[] months;
    private String name;
    private double averageTemperature;

    public Season(String name, double averageTemperature, String... months) {
        this.months = months;
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "months=" + Arrays.toString(months) +
                ", name='" + name + '\'' +
                ", averageTemperature=" + averageTemperature +
                '}';
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
}
