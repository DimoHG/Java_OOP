package com.softuni.InterfacesAndAbstraction.celebration;

public class Pet implements Birthable {
    private String birthDate;
    private String name;

    public Pet(String name, String birthDate) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
