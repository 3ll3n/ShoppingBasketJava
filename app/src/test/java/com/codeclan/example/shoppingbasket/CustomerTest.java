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

    @Before
    public void before() {
        shoppingbasket = new ShoppingBasket();
        customer1 = new Customer("Layla", shoppingbasket);
    }

    @Test
    public void testCustomerCanAddItemToShoppingBasket() {
        Item milk = new Milk("full-fat", 4);
        customer1.chooseItem(milk);
        assertEquals(1, shoppingbasket.getNumberOfItems());
    }



}
