package com.softuni.Reflection;

public class MySoftuniClass {
    String softuniAddress;

    public MySoftuniClass() {
    }

    public MySoftuniClass(String softuniAddress) {
        this.softuniAddress = softuniAddress;
    }

    public String getSoftuniAddress() {
        return softuniAddress;
    }

    public void setSoftuniAddress(String softuniAddress) {
        this.softuniAddress = softuniAddress;
    }

    @Override
    public String toString() {
        return "MySoftuniClass{" +
                "softuniAddress='" + softuniAddress + '\'' +
                '}';
    }
}
