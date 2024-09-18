import java.util.Set;

class Burger {
    private String name;
    private String bunType;
    private int patties;
    private boolean hasCheese;
    private boolean hasBacon;

    // Constructor
    public Burger(String name, String bunType, int patties, boolean hasCheese, boolean hasBacon) {
        this.name = name;
        this.bunType = bunType;
        this.patties = patties;
        this.hasCheese = hasCheese;
        this.hasBacon = hasBacon;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for bunType
    public String getBunType() {
        return bunType;
    }

    public void setBunType(String bunType) {
        this.bunType = bunType;
    }

    // Getter and Setter for patties
    public int getPatties() {
        return patties;
    }

    public void setPatties(int patties) {
        this.patties = patties;
    }

    // Getter and Setter for hasCheese
    public boolean isHasCheese() {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }

    // Getter and Setter for hasBacon
    public boolean isHasBacon() {
        return hasBacon;
    }

    public void setHasBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
    }

    // Method to print burger details
    public void printDetails() {
        System.out.println("> INFO");
        System.out.println("> Burger: " + name);
        System.out.println("> Bun Type: " + bunType);
        System.out.println("> Patties: " + patties);
        System.out.println("> Cheese: " + (hasCheese ? "Yes" : "No"));
        System.out.println("> Bacon: " + (hasBacon ? "Yes" : "No"));
    }

    // Main method for testing
    public static void main(String[] args) {
        Burger classic = new Burger("Classic Burger", "Sesame Seed", 2, true, false);
        classic.printDetails();
    }
}