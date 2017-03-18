package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testGetName() {
        assertEquals("Wholemeal", bread.getName());
    }

    @Test
    public void testSetName() {
        milk.setName("Semi skimmed");
        assertEquals("Semi skimmed", milk.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(2, butter.getPrice());
    }

    @Test
    public void testSetPrice() {
        butter.setPrice(3);
        assertEquals(3, butter.getPrice());
    }
}
