import java.util.List;

class BaseBeverage {
    // Private fields for the BaseBeverage
    private String name;
    private double price;
    private boolean isHot;

    // Constructor
    public BaseBeverage(String name, double price, boolean isHot) {
        this.name = name;
        this.price = price;
        this.isHot = isHot;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean isHot) {
        this.isHot = isHot;
    }
}

class CustomBeverage extends BaseBeverage {
    // Private fields for additional customization
    private List<String> ingredients;

    // Constructor
    public CustomBeverage(String name, double price, boolean isHot, List<String> ingredients) {
        super(name, price, isHot);
        this.ingredients = ingredients;
    }

    // Getters and setters
    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}

public class BeverageTest {
    public static void main(String[] args) {
        // TODO: Create instances of BaseBeverage and CustomBeverage
        // TODO: Implement sample method calls and print statements to test the classes
    }
}