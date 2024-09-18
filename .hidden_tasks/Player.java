import java.util.Set;

public class Player {
    private String name;
    private int score;
    private int x, y;
    private int health;

    // Constructor
    public Player(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
        this.score = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method to move player
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                y++;
                break;
            case "down":
                y--;
                break;
            case "left":
                x--;
                break;
            case "right":
                x++;
                break;
            default:
                System.out.println("Invalid direction");
        }
        System.out.println("New Position: (" + x + ", " + y + ")");
    }

    // Increase score by a specified amount
    public void increaseScore(int amount) {
        score += amount;
        System.out.println("Score: " + score);
    }

    // Player interacts with an enemy
    public void interactWithEnemy(Enemy enemy) {
        System.out.println(name + " encounters " + enemy.getName());
        health -= enemy.getDamage();
        System.out.println(name + " takes damage. Health: " + health);
        if (health <= 0) {
            System.out.println(name + " has been defeated by " + enemy.getName());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Player player = new Player("Hero", 100, 0, 0);
        player.move("right");
        player.move("up");
        player.increaseScore(10);

        Enemy enemy = new Enemy("Goblin", 5);
        player.interactWithEnemy(enemy);

        player.move("down");
    }
}