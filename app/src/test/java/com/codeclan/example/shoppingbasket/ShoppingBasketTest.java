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


}
