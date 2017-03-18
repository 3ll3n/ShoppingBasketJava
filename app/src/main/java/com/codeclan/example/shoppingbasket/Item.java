package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 18/03/2017.
 */

public abstract class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
