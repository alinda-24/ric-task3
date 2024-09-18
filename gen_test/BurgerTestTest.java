package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class BurgerTest {
    private Burger cheeseburger;
    private Burger veganBurger;

    @Before
    public void setUp() {
        cheeseburger = new Burger("Cheeseburger", "Whole Wheat", 2, true, true);
        veganBurger = new Burger("Vegan Burger", "Gluten Free", 1, false, false);
    }

    @Test
    public void testGetName() {
        assertEquals("Cheeseburger", cheeseburger.getName());
        assertEquals("Vegan Burger", veganBurger.getName());
    }

    @Test
    public void testSetName() {
        cheeseburger.setName("Deluxe Cheeseburger");
        assertEquals("Deluxe Cheeseburger", cheeseburger.getName());
    }

    @Test
    public void testGetBunType() {
        assertEquals("Whole Wheat", cheeseburger.getBunType());
        assertEquals("Gluten Free", veganBurger.getBunType());
    }

    @Test
    public void testSetBunType() {
        veganBurger.setBunType("Whole Wheat");
        assertEquals("Whole Wheat", veganBurger.getBunType());
    }

    @Test
    public void testGetPatties() {
        assertEquals(2, cheeseburger.getPatties());
        assertEquals(1, veganBurger.getPatties());
    }

    @Test
    public void testSetPattiesValid() {
        cheeseburger.setPatties(3);
        assertEquals(3, cheeseburger.getPatties());
    }
    
    @Test(expected = IllegalArgumentException.