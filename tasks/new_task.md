# 🍔 Burger Builder Java Project

For this exercise, you'll practice designing Java classes that represent various burger elements. This task will enhance your understanding of object-oriented concepts through modeling, encapsulation, and scope management.

### 💀 Deadline

Complete this assignment before the exercise session on **Friday, November 24th**.

### 👩‍🏫 Instructions

For submission details, refer to the [assignment section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

- Review [Classes and Objects in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- Sign up and explore resources on [Oracle Learning Platform](https://education.oracle.com).

### ✅ Learning Goals

This week's learning focuses on:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🚨 Troubleshooting Guide

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). 
2. Post a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) if needed.
3. Consult a TA during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).

Discuss with peers, but **do not share solutions**!

### 🏛 Assignment

Welcome to the world of fast food innovation! Your task is to design Java classes to represent a typical burger. You'll incorporate class design principles while including essential elements like instance fields, constructors, and encapsulation with getters and setters.

#### Exercise 1.0 -- Fields

In the `src` directory, create a `Burger.java` class. Model the burger with these fields:

- `String` name
- `String` bunType
- `int` patties
- `boolean` hasCheese
- `boolean` hasBacon

If done correctly, Example 1 should compile with `Burger.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Burger {
    
    // Place your fields here!

    public static void main(String[] args) {
      Burger classic = new Burger();
      
      classic.name = "Classic Burger";
      classic.bunType = "Sesame Seed";
      classic.patties = 2;
      classic.hasCheese = true;
      classic.hasBacon = false;
      
      System.out.println("Name: " + classic.name);
      System.out.println("Bun Type: " + classic.bunType);
      System.out.println("No. of Patties: " + classic.patties);
      System.out.println("Has Cheese: " + classic.hasCheese);
      System.out.println("Has Bacon: " + classic.hasBacon);
    }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

Encapsulation allows controlled access to fields. Implement private fields in `Burger` and provide corresponding getters and setters. This results in ten methods, making Example 2 compile successfully.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Burger {

    // Define private fields here!

    // Implement getters and setters here!

    public static void main(String[] args) {
      Burger classic = new Burger();
      
      classic.setName("Classic Burger");
      classic.setBunType("Sesame Seed");
      classic.setPatties(2);
      classic.setHasCheese(true);
      classic.setHasBacon(false);
      
      System.out.println("Name: " + classic.getName());
      System.out.println("Bun Type: " + classic.getBunType());
      System.out.println("No. of Patties: " + classic.getPatties());
      System.out.println("Has Cheese: " + classic.isHasCheese());
      System.out.println("Has Bacon: " + classic.isHasBacon());
    }
  }
  ```
</details>

> **Note:** Boolean getters use `is` instead of `get`.

#### Exercise 1.2 -- Constructor

Revise using a constructor to simplify object creation. Incorporate a constructor to overcome the verbosity seen in Example 2.

#### Exercise 1.3 -- Printing with `printDetails()`

Implement a `printDetails()` method to output burger details to the terminal.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
    Burger classic = new Burger("Classic Burger", "Sesame Seed", 2, true, false);

    classic.printDetails();
  }
  ```

  Expected terminal output:

  ```
  > INFO
  > Burger: Classic Burger
  > Bun Type: Sesame Seed
  > Patties: 2
  > Cheese: Yes
  > Bacon: No
  ```
</details>

#### Exercise 1.4 -- Variable Shadowing

Explore variable shadowing by examining the following examples. Prepare to explain this in class.

Example 1:
```java
public class ShadowExample1 {
    private double price = 10.5;

    public void showPrice() {
        double price = 7.0;
        System.out.println(price); // Why isn't this 10.5?
    }

    public static void main(String[] args) {
        new ShadowExample1().showPrice();
    }
}
```

Example 2:
```java
public class Restaurant {
  private String ownerName;
  private String restaurantName;

  public Restaurant(String ownerName, String restaurantName) {
    ownerName = ownerName; // Resolve this conflict
    restaurantName = restaurantName;
  }

  public void greet() {
    String name = "Visitor";
    System.out.println(name + ", welcome to " + restaurantName + "!"); // Why isn't the restaurant name printed?
  }
}
```

Learning about local vs global scope and using `this` to address variable shadowing will be critical in understanding these examples.