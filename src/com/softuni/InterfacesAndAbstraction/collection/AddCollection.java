package com.softuni.InterfacesAndAbstraction.collection;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String item) {
        super.getItems().add(item);
        return super.getItems().indexOf(item);
    }
}
