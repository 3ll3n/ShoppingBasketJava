package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 18/03/2017.
 */

public class ShoppingBasket {

    protected ArrayList<Item> items;

    public ShoppingBasket() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void emptyBasket() {
        items.clear();
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public int totalPrice() {
       int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
