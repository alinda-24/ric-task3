# Adventure Quest: Java Edition

For this exercise, you are tasked with creating a simple adventure game in Java. In this game, you'll model a player character and enemies, along with a basic scoring system. This is an opportunity to practice your skills in designing Java classes and working with their fundamental components.

### 💀 Deadline

Complete this assignment by **Friday, September 30th**.

### 👩‍🏫 Instructions

For submission guidelines and support, see the [assignments section of the course instructions](https://example.com/course-instructions#assignments).

### 📝 Preparation

To succeed in this task, ensure you review the following materials:

- Read [Object-Oriented Programming Concepts](https://example.com/learning-resources/oop)
- Familiarize yourself with Java class design principles.

> **Assistant's Note:** Course materials may vary; feel free to read ahead if something is unclear.

### ✅ Learning Goals

This week's learning objectives are:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide

For any questions or issues, follow these steps:

1. Review [current issues](https://example.com/help/issues) to see if others have the same question.
2. If not, post a new question by creating a [New Issue](https://example.com/help/issues/new) with a descriptive title.
3. Consult with a TA during [weekly labs](https://example.com/schedule).

Collaborate with peers, but **do not share solutions!**

### 🏛 Assignment

Welcome to the realm of adventure! You are to model the core mechanics of a simple game where a player can interact with enemies and increase their score. Let's get started by exploring the various components of your game:

#### Exercise 1.0 -- Player Class Fields

Begin by creating a class named `Player.java` in the `src` folder. Model the player with the following fields:

- `String` name
- `int` score
- `int` positionX
- `int` positionY

Your main task is to manage player movement within the game space, so adjust position coordinates as needed.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Player {

    // Define the fields here!

    public static void main(String[] args) {
      // Initialize a player with default values
      Player hero = new Player();

      // Print initial state
      System.out.println("Player Name: " + hero.name);
      System.out.println("Score: " + hero.score);
      System.out.println("Position: (" + hero.positionX + ", " + hero.positionY + ")");
    }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

Implement encapsulation by setting field access to `private`. Provide *getters* and *setters* for each field. This encapsulation will allow you to control how attributes are accessed and modified.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Player {

    // Define fields and their accessors/mutators here!

    public static void main(String[] args) {
      Player hero = new Player();

      // Use setters
      hero.setName("Hero");
      hero.setScore(100);
      hero.setPositionX(5);
      hero.setPositionY(10);

      // Use getters
      System.out.println("Player Name: " + hero.getName());
      System.out.println("Score: "+ hero.getScore());
      System.out.println("Position: (" + hero.getPositionX() + ", " + hero.getPositionY() + ")");
    }
  }
  ```
</details>

#### Exercise 1.2 -- Constructor

Enhance your `Player` class with a constructor to initialize fields upon object creation. This makes your class more intuitive and user-friendly.

#### Exercise 1.3 -- printStatus()

Implement a `printStatus()` method to display the player's current state in the console. Explore Example 3 to guide your method design.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public class Player {
    // Define fields, constructor, and methods here!

    public void printStatus() {
      System.out.println("> Player: " + this.name);
      System.out.println("> Score: " + this.score);
      System.out.println("> Position: (" + this.positionX + ", " + this.positionY + ")");
    }

    public static void main(String[] args) {
      Player hero = new Player("Hero", 0, 0, 0);
      hero.printStatus();
    }
  }
  ```
</details>

#### Exercise 2.0 -- Enemy Class

Create a second class named `Enemy.java`, utilizing similar concepts to the `Player` class. Fields should reflect enemy-specific attributes, such as:

- `String` type
- `int` health
- `int` positionX
- `int` positionY

Declare and organize the fields to control enemy interactions with the player.

#### Exercise 2.1 -- Interaction Method

Add an interaction method in the `Player` class that accepts an `Enemy` object, reducing health or updating position on interaction. Follow Example 4 to plan your method.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public class Player {
    // Extend the class with new methods here!

    public void interact(Enemy enemy) {
      // Interaction logic here
      System.out.println("Player " + this.name + " interacts with Enemy of type " + enemy.getType());
      // Reduce health or score based on interaction
    }

    public static void main(String[] args) {
      Player hero = new Player("Hero", 100, 0, 0);
      Enemy goblin = new Enemy("Goblin", 30, 2, 2);

      hero.interact(goblin);
    }
  }
  ```
</details>

#### Exercise 2.2 -- Scoring System

Enhance the scoring system to reward players upon defeating an enemy. Adjust player's score accordingly.

#### Exercise 2.3 -- Variable Shadowing

Review the following examples of variable shadowing. Consider how to address this issue in your game design.

```java
public class ShadowExample1 {
    private int experience = 100;

    public void levelUp() {
        int experience = 200;
        System.out.println(experience); // How can we print the correct experience?
    }

    public static void main(String[] args) {
        new ShadowExample1().levelUp();
    }
}
```

```java
public class GameEntity {
    private String name;

    public GameEntity(String name) {
        name = name; // What's wrong with this assignment?
    }

    public void display() {
        String name = "Unknown";
        System.out.println(name + " is active"); // How to print the object's name instead?
    }
}
```

> **Assistant's Note:** Reflect on scope, local variables, and instance fields for resolving shadowing issues.

---

This task challenges you to apply key Java concepts in a game context. Use the examples provided to guide your implementations. Best of luck, and may your adventures be fruitful!