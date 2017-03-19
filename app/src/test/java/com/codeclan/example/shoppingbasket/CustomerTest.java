package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class CustomerTest {

    Customer customer1;
    ShoppingBasket shoppingbasket;

    Item milk;
    Item bread;

    @Before
    public void before() {
        shoppingbasket = new ShoppingBasket();
        customer1 = new Customer("Layla", shoppingbasket);
        milk = new Milk("full-fat", 4);
        bread = new Bread("pitta", 5);
    }

    @Test
    public void testCustomerCanAddItemToShoppingBasket() {
        customer1.chooseItem(milk);
        assertEquals(1, shoppingbasket.getNumberOfItems());
    }

    @Test
    public void testCustomerCanRemoveItemFromShoppingBasket() {
        customer1.chooseItem(milk);
        customer1.chooseItem(bread);
        customer1.returnItem(bread);
        assertEquals(1, shoppingbasket.getNumberOfItems());
    }

    @Test
    public void testCustomerCanEmptyShoppingBasket() {
        customer1.chooseItem(milk);
        customer1.chooseItem(bread);
        customer1.emptyBasket();
        assertEquals(0, shoppingbasket.getNumberOfItems());
    }



}
