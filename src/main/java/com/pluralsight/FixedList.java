package com.pluralsight;

import java.util.List;

public class FixedList<T> {

    private List<T> items;
    private int maxSize;

    public FixedList(List<T> items, int maxSize) {
        this.items = items;
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            System.out.println("The list is full");
        }
    }

    public List<T> getItems() {
        return items;
    }
}
