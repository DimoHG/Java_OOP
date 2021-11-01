package com.softuni.Encapsulation.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age){
        this.setAge(age);
        this.setName(name);
    }

    private void setAge(int age){
        if(age < 0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private double calculateProductPerDay(){
        if(this.age < 6){
            return 2;
        } else if (this.age < 12){
            return 1;
        } else {
            return 0.75;
        }
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.productPerDay());
    }
}
