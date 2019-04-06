package com.romanstetsiuk.myapp;

import java.util.List;

public class Store {

    List<Item> items;

    @Override
    public String toString() {
        return "Store{" +
                "items=" + items +
                '}';
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Store(List<Item> items) {
        this.items = items;
    }

    public Store() {
    }
}
