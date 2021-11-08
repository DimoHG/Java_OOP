package com.softuni.InterfacesAndAbstraction.collection;

public class MyListImpl extends Collection implements MyList {
    //List
    //maxSize
    //constructor

    @Override
    public String remove() {
        return super.getItems().remove(0);
    }

    @Override
    public int add(String item) {
        super.getItems().add(0, item);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
