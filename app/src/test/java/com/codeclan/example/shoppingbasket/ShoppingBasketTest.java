package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingbasket;

    Bread bread;
    Milk milk;

    @Before
    public void before() {
        shoppingbasket = new ShoppingBasket();
        bread = new Bread("Baguette", 1);
        milk = new Milk("full fat", 2);
    }

    @Test
    public void testCanAddItemToShoppingBasket() {
        shoppingbasket.addItem(bread);
        assertEquals(1, shoppingbasket.getNumberOfItems());
    }

    @Test
    public void testCanRemoveItemFromShoppingBasket() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(milk);
        shoppingbasket.removeItem(milk);
        assertEquals(1, shoppingbasket.getNumberOfItems());
    }

    @Test
    public void testCanEmptyShoppingBasket() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(milk);
        shoppingbasket.emptyBasket();
        assertEquals(0, shoppingbasket.getNumberOfItems());
    }

    @Test
    public void testGetNumberOfItems() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(milk);
        assertEquals(2, shoppingbasket.getNumberOfItems());
    }

    @Test
    public void testGetTotalValue() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(milk);
        assertEquals(3, shoppingbasket.totalPrice());
    }


}
