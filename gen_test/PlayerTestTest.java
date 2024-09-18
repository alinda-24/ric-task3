package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0, 0);
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
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
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
        player.setYPosition(7);
        assertEquals(7, player.getYPosition());
    }

    @Test
    public void testInteract() {
        player.interact(enemy);
        assertEquals(5, player.getScore());
    }

    @Test
    public void testInteractWithNegativePointsEnemy() {
        Enemy negativeEnemy = new Enemy("Trap", -5);
        player.interact(negativeEnemy);
        assertEquals(-5, player.getScore());
    }

    @Test
    public void testPlayerInitialization() {
        Player newPlayer = new Player("Mage", 10, 2, 3);
        assertEquals("Mage", newPlayer.getName());
        assertEquals(10, newPlayer.getScore());
        assertEquals(2, newPlayer.getXPosition());
        assertEquals(3, newPlayer.getYPosition());
    }

    @Test
    public void testEnemyInitialization() {
        Enemy newEnemy = new Enemy("Dragon", 20);
        assertEquals("Dragon", newEnemy.getName());
        assertEquals(20, newEnemy.getPoints());
    }
}