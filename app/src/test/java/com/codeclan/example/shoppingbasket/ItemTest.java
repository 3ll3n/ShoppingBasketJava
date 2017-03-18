package com.codeclan.example.shoppingbasket;

import org.junit.Before;

/**
 * Created by user on 18/03/2017.
 */

public class ItemTest {

    Bread bread;
    Milk milk;
    Butter butter;

    @Before
    public void before() {
        bread = new Bread("Wholemeal", 2);
        milk = new Milk("Skimmed", 1);
        butter = new Butter("Unsalted", 2);
    }
}
