package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerEnemyTest {
    private Enemy goblin;
    private Player hero;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 30, 0, 0);
        hero = new Player("Hero", 100, 0, 0);
    }

    @Test
    public void testPlayerGetName() {
        assertEquals("Hero", hero.getName());
    }

    @Test
    public void testPlayerSetName() {
        hero.setName("Warrior");
        assertEquals("Warrior", hero.getName());
    }

    @Test
    public void testPlayerGetScore() {
        assertEquals(100, hero.getScore());
    }

    @Test
    public void testPlayerSetScore() {
        hero.setScore(200);
        assertEquals(200, hero.getScore());
    }

    @Test
    public void testPlayerInitialPosition() {
        assertEquals(0, hero.getPositionX());
        assertEquals(0, hero.getPositionY());
    }

    @Test
    public void testPlayerSetPosition() {
        hero.setPositionX(5);
        hero.setPositionY(10);
        assertEquals(5, hero.getPositionX());
        assertEquals(10, hero.getPositionY());
    }

    @Test
    public void testPlayerInteractionWithEnemyAtSamePosition() {
        hero.interact(goblin);
        assertEquals(0, goblin.getHealth());
        assertEquals(110, hero.getScore());
    }

    @Test
    public void testPlayerInteractionWithEnemyAtDifferentPosition() {
        goblin.setPositionX(1);
        goblin.setPositionY(1);
        hero.interact(goblin);
        assertEquals(30, goblin.getHealth());
        assertEquals(100, hero.getScore());
    }

    @Test
    public void testEnemyGetType() {
        assertEquals("Goblin", goblin.getType());
    }

    @Test
    public void testEnemySetType() {
        goblin.setType("Orc");
        assertEquals("Orc", goblin.getType());
    }

    @Test
    public void testEnemyGetHealth() {
        assertEquals(30, goblin.getHealth());
    }

    @Test
    public void testEnemySetHealth() {
        goblin.setHealth(50);
        assertEquals(50, goblin.getHealth());
    }

    @Test
    public void testGoblinInitialPosition() {
        assertEquals(0, goblin.getPositionX());
        assertEquals(0, goblin.getPositionY());
    }

    @Test
    public void testGoblinSetPosition() {
        goblin.setPositionX(3);
        goblin.setPositionY(4);
        assertEquals(3, goblin.getPositionX());
        assertEquals(4, goblin.getPositionY());
    }

    @Test
    public void testInvalidPositionHandling() {
        goblin.setPositionX(-1);
        goblin.setPositionY(-1);
        assertEquals(-1, goblin.getPositionX()); 
        assertEquals(-1, goblin.getPositionY());

        hero.setPositionX(-5);
        hero.setPositionY(-5);
        assertEquals(-5, hero.getPositionX());
        assertEquals(-5, hero.getPositionY());
    }

    @Test
    public void testEnemyDefeatLogic() {
        goblin.setPositionX(0);
        goblin.setPositionY(0);
        hero.interact(goblin);
        assertEquals(0, goblin.getHealth());
        assertEquals(110, hero.getScore()); // Score increased by 10
    }
}