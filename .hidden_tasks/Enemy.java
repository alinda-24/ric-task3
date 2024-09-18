class Enemy {
    private String name;
    private int points;

    // Constructor to initialize fields
    public Enemy(String name, int points) {
        this.name = name;
        this.points = points;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}