public class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void printStatus() {
        System.out.println("> Player: " + this.name);
        System.out.println("> Score: " + this.score);
        System.out.println("> Position: (" + this.positionX + ", " + this.positionY + ")");
    }

    public void interact(Enemy enemy) {
        System.out.println("Player " + this.name + " interacts with Enemy of type " + enemy.getType());
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            System.out.println("Defeated the enemy!");
            this.score += 10;
            enemy.setHealth(0);
        } else {
            System.out.println("Move closer to the enemy to attack.");
        }
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 100, 0, 0);
        Enemy goblin = new Enemy("Goblin", 30, 0, 0);

        hero.printStatus();
        hero.interact(goblin);
        hero.printStatus();
    }
}