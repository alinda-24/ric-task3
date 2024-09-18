import java.util.Set;

public class Player {
    private String name;
    private int score;
    private int x;
    private int y;
    private int health;

    // Constructor
    public Player(String name, int health, int x, int y) {
        // TODO: Initialize player attributes here.
        // Example (to remove): this.name = name;
        // TODO: Implement initialization logic.
    }

    // Getters and Setters
    public String getName() {
        // TODO: Implement logic and return the appropriate value.
        return name; // Placeholder return statement
    }

    public void setName(String name) {
        // TODO: Implement this method.
        this.name = name; // Example implementation
    }

    public int getScore() {
        // TODO: Implement logic and return the appropriate value.
        return score; // Placeholder return statement
    }

    public void setScore(int score) {
        // TODO: Implement this method.
        this.score = score; // Example implementation
    }

    public int getX() {
        // TODO: Implement logic and return the appropriate value.
        return x; // Placeholder return statement
    }

    public void setX(int x) {
        // TODO: Implement this method.
        this.x = x; // Example implementation
    }

    public int getY() {
        // TODO: Implement logic and return the appropriate value.
        return y; // Placeholder return statement
    }

    public void setY(int y) {
        // TODO: Implement this method.
        this.y = y; // Example implementation
    }

    public int getHealth() {
        // TODO: Implement logic and return the appropriate value.
        return health; // Placeholder return statement
    }

    public void setHealth(int health) {
        // TODO: Implement this method.
        this.health = health; // Example implementation
    }

    // Method to move player
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                // TODO: Implement movement logic for up.
                break;
            case "down":
                // TODO: Implement movement logic for down.
                break;
            case "left":
                // TODO: Implement movement logic for left.
                break;
            case "right":
                // TODO: Implement movement logic for right.
                break;
            default:
                System.out.println("Invalid direction!");
        }
        System.out.println("New Position: (" + x + ", " + y + ")");
    }

    // Increase score by a specified amount
    public void increaseScore(int amount) {
        // TODO: Implement this method.
        // Example: this.score += amount;
    }

    // Player interacts with an enemy
    public void interactWithEnemy(Enemy enemy) {
        // TODO: Implement interaction logic.
        if (health <= 0) {
            // TODO: Implement what happens when health is <= 0.
            System.out.println(name + " has been defeated!");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // TODO: Implement test logic.
        // Example: Player player = new Player("Alice", 100, 0, 0);
    }
}