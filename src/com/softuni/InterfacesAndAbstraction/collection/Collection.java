package com.softuni.InterfacesAndAbstraction.collection;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {

    private int maxSize;
    private List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
        this.maxSize = 100;
    }

    public List<String> getItems() {
        return items;
    }
}
