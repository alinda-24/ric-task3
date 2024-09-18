package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Enemy goblin;
    private Player hero;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 10);
        hero = new Player("Hero", 100, 0, 0);
    }

    @Test
    public void testEnemyName() {
        assertEquals("Goblin", goblin.getName());
        goblin.setName("Orc");
        assertEquals("Orc", goblin.getName());
    }

    @Test
    public void testEnemyDamage() {
        assertEquals(10, goblin.getDamage());
        goblin.setDamage(15);
        assertEquals(15, goblin.getDamage());
    }

    @Test
    public void testPlayerName() {
        assertEquals("Hero", hero.getName());
        hero.setName("Warrior");
        assertEquals("Warrior", hero.getName());
    }

    @Test
    public void testPlayerScore() {
        assertEquals(0, hero.getScore());
        hero.setScore(50);
        assertEquals(50, hero.getScore());
    }

    @Test
    public void testPlayerPosition() {
        assertEquals(0, hero.getX());
        assertEquals(0, hero.getY());

        hero.setX(5);
        hero.setY(10);
        assertEquals(5, hero.getX());
        assertEquals(10, hero.getY());
    }

    @Test
    public void testPlayerHealth() {
        assertEquals(100, hero.getHealth());
        hero.setHealth(80);
        assertEquals(80, hero.getHealth());
    }

    @Test
    public void testPlayerMove() {
        hero.move("right");
        assertEquals(1, hero.getX());
        assertEquals(0, hero.getY());

        hero.move("up");
        assertEquals(1, hero.getX());
        assertEquals(1, hero.getY());
        
        hero.move("down");
        assertEquals(1, hero.getX());
        assertEquals(0, hero.getY());

        hero.move("left");
        assertEquals(0, hero.getX());
        assertEquals(0, hero.getY());

        hero.move("invalid");
        assertEquals(0, hero.getX());
        assertEquals(0, hero.getY());
    }

    @Test
    public void testPlayerIncreaseScore() {
        hero.increaseScore(20);
        assertEquals(20, hero.getScore());

        hero.increaseScore(30);
        assertEquals(50, hero.getScore());
    }

    @Test
    public void testPlayerInteractWithEnemy() {
        hero.interactWithEnemy(goblin);
        assertEquals(90, hero.getHealth());

        hero.setHealth(10);
        hero.interactWithEnemy(goblin);
        assertEquals(-10, hero.getHealth()); // Should take 10 damage and go negative
    }
}