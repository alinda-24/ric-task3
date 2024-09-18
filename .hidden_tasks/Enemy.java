import java.util.Set;

public class Enemy {
    private String name;
    private int damage;

    // Constructor
    public Enemy(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Main method for testing
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Goblin", 10);
        System.out.println("Enemy: " + enemy.getName());
        System.out.println("Damage: " + enemy.getDamage());
    }
}