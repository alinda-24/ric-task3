package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 10, 0, 0);
        enemy = new Enemy("Goblin", 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testGetScore() {
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(20);
        assertEquals(20, player.getScore());
    }

    @Test
    public void testGetXPosition() {
        assertEquals(0, player.getXPosition());
    }

    @Test
    public void testSetXPosition() {
        player.setXPosition(5);
        assertEquals(5, player.getXPosition());
    }

    @Test
    public void testGetYPosition() {
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testSetYPosition() {
        player.setYPosition(10);
        assertEquals(10, player.getYPosition());
    }

    @Test
    public void testInteractWithEnemy() {
        player.interact(enemy);
        assertEquals(15, player.getScore());
    }
}