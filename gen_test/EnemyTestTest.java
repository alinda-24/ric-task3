package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {
    private Enemy goblin;
    private Enemy dragon;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 5);
        dragon = new Enemy("Dragon", 50);
    }

    @Test
    public void testGetName() {
        assertEquals("Goblin", goblin.getName());
        assertEquals("Dragon", dragon.getName());
    }

    @Test
    public void testGetPoints() {
        assertEquals(5, goblin.getPoints());
        assertEquals(50, dragon.getPoints());
    }
}

// BurgerTest.java
package test;

import main.Burger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

