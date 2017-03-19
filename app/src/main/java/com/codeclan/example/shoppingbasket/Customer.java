package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 18/03/2017.
 */

public class Customer {

    private String name;
    private ShoppingBasket shoppingbasket;

    public Customer (String name, ShoppingBasket shoppingbasket) {
        this.name = name;
        this.shoppingbasket = shoppingbasket;
    }

    public void chooseItem(Item item) {
        this.shoppingbasket.addItem(item);
    }

    public void returnItem(Item item) {
        this.shoppingbasket.removeItem(item);
    }

    public void emptyBasket() {
        this.shoppingbasket.emptyBasket();
    }

    public void checkout() {
        this.shoppingbasket.totalPrice();
    }
}
