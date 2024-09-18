class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor to initialize fields
    public Player(String name, int score, int xPosition, int yPosition) {
        this.name = name;
        this.score = score;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and setters
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

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Method to print player's information
    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method for interacting with an Enemy
    public void interact(Enemy enemy) {
        System.out.println("Player " + name + " encountered " + enemy.getName() + "!");
        score += enemy.getPoints();
        System.out.println(name + "'s new score: " + score);
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0, 0);
        Enemy goblin = new Enemy("Goblin", 5);

        hero.printInfo();
        hero.interact(goblin);
    }
}