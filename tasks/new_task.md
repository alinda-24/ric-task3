# Adventure World: Create Your Own Game!

For your next programming exercise, you are going to build a simple game application in Java that focuses on object-oriented design. You will model key components such as the player, scoring system, and enemy interactions, enhancing your understanding of Java classes.

### 💀 Deadline

This assignment must be completed before the start of the next session on **Friday 10th November**.

### 👩‍🏫 Instructions

For detailed instructions on how to complete and submit the assignment, refer to [this section of the course guide](https://example.com/course-guide#assignments).

### 📝 Preparation

To be ready for this task, ensure you have read and completed the exercises from Module 3 of the OLI materials:

- Read [Object-Oriented Programming Concepts](https://example.com/oli/module3).
- Register for the course using the key `java-2023` if you haven't already.

### ✅ Learning Goals

By completing this assignment, you will practice:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you encounter any issues, follow these steps:

1. Check the [issues and solutions](https://example.com/help/issues) for common problems.
2. Post your question as a [New Issue](https://example.com/help/issues/new) if it hasn't been addressed.
3. Ask a TA during the weekly lab session ([see schedule](https://example.com/schedule)).

Collaborate with your peers, but **do not share solutions**.

### 🏛 Assignment

You're tasked with creating a Java game featuring player movement, scoring, and enemy interactions. Follow the steps below to achieve this:

#### Exercise 1 -- Fields

In the `src` directory, create a class called `Player`. It should contain:

- `String` name
- `int` score
- `int` xPosition
- `int` yPosition

Your main method should compile if structured as follows:

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Player {

    // Add your fields

    public static void main(String[] args) {
      Player hero = new Player();
      
      // Assign values
      hero.name = "Hero";
      hero.score = 0;
      hero.xPosition = 0;
      hero.yPosition = 0;

      System.out.println("Player: " + hero.name);
      System.out.println("Score: " + hero.score);
      System.out.println("Position: (" + hero.xPosition + ", " + hero.yPosition + ")");
    }

  }
  ```
</details>

#### Exercise 2 -- Getters and Setters

Implement encapsulation for `Player` by making its fields `private` and providing *getters* and *setters*. Your main method should reflect the following changes:

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Player {

    // Private fields and corresponding getters and setters
    
    public static void main(String[] args) {
      Player hero = new Player();
      
      hero.setName("Hero");
      hero.setScore(0);
      hero.setXPosition(0);
      hero.setYPosition(0);

      System.out.println("Player: " + hero.getName());
      System.out.println("Score: " + hero.getScore());
      System.out.println("Position: (" + hero.getXPosition() + ", " + hero.getYPosition() + ")");
    }

  }
  ```
</details>

#### Exercise 3 -- Constructor

Add a constructor to the `Player` class to initialize its fields upon creation:

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
    Player hero = new Player("Hero", 0, 0, 0);
    
    hero.printInfo();
  }
  ```
</details>

#### Exercise 4 -- Print Info

Create a method `printInfo()` to display the player's details on the terminal:

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  Player hero = new Player("Hero", 0, 0, 0);
  hero.printInfo();
  ```

  ```
  > Player: Hero
  > Score: 0
  > Position: (0, 0)
  ```
</details>

#### Exercise 5 -- Enemy Interaction

Model the enemy with an `Enemy` class and implement a method `interact()` in `Player` that affects the player's score:

<details>
  <summary> 🛠 Example 5 </summary>

  ```java
  Player hero = new Player("Hero", 0, 0, 0);
  Enemy goblin = new Enemy("Goblin", 5);

  hero.interact(goblin);
  ```

  ```
  > Player Hero encountered Goblin!
  > Hero's new score: 5
  ```
</details>

#### Exercise 6 -- Variable Shadowing

Understand *variable shadowing* by examining the examples below. Be prepared to discuss fixes in class:

```Java
public class ShadowExample1 {
  private int score = 100;

  public void adjustScore() {
    int score = 50;
    System.out.println(score); // Outputs 50 instead of 100
  }

  public static void main(String[] args){
    new ShadowExample1().adjustScore();
  }
}
```

```Java
public class Game {
  private String playerName;

  public Game(String playerName) {
    playerName = playerName; // Incorrect assignment
  }

  public static void main(String[] args){
    Game game = new Game("Warrior");
    System.out.println("Player: " + game.playerName); // Expected output "Warrior"
  }
}
```

> **Assistant's Note:** Consider the scope of your variables and how the `this` keyword can resolve shadowing issues.