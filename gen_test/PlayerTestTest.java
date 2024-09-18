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
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }
    
    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", enemy.getName());
        assertEquals(5, enemy.getPoints());
    }
    
    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }
    
    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }
    
    @Test
    public void testSetXPosition() {
        player.setXPosition(5);
        assertEquals(5, player.getXPosition());
    }

    @Test
    public void testSetYPosition() {
        player.setYPosition(10);
        assertEquals(10, player.getYPosition());
    }
    
    @Test
    public void testInteractWithEnemy() {
        player.interact(enemy);
        assertEquals(5, player.getScore());
    }
    
    @Test
    public void testMultipleInteractions() {
        player.interact(enemy);
        assertEquals(5, player.getScore());
        player.interact(enemy);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testPlayerInfoOutput() {
        player.printInfo();
        // Here, we can verify if output is as expected, usually via a third-party library that captures stdout.
        // We won't test System.out output here, but this is usually part of integration tests rather than unit tests.
    }

    // Tests for edge cases, such as negative values for score and position
    
    @Test
    public void testNegativeScore() {
        player.setScore(-5);
        assertEquals(-5, player.getScore());
    }

    @Test
    public void testNegativeXPosition() {
        player.setXPosition(-10);
        assertEquals(-10, player.getXPosition());
    }

    @Test
    public void testNegativeYPosition() {
        player.setYPosition(-20);
        assertEquals(-20, player.getYPosition());
    }

    // Performance tests could involve timing multiple interactions, but usually, such tests would be part of integration or system-wide tests.
}