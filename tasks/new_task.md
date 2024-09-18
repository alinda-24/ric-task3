# Java Game Development: Simple Arcade Adventure

For this assignment, you'll embark on the journey of crafting a simple arcade-style game using Java. You'll exercise your skills in object-oriented programming by designing Java classes and implementing various functions and features essential for an engaging game. Dive into learning with this exciting project!

### 🎮 Game Assignment Overview

You'll build an interactive game that includes:

- **Player Movement**: Allow the player to navigate within the game space.
- **Scoring System**: Implement a scoring mechanism based on player actions.
- **Enemy Interactions**: Create basic interactions between the player and enemies.

### 💀 Deadline

Please submit your work before the exercise on **Friday 24th November**.

### 👩‍🏫 Submission Instructions

Refer to the [course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments) for guidance on how to complete and submit your assignment.

### 📚 Preparation

Before you start, ensure to go through the following:

- Read the section [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Register at https://kth.oli.cmu.edu/ using the course key `dd1337-ht23` if you haven't already.

> **Note:** Reading ahead is encouraged if you cannot find all the material outlined for this task.

### ✅ Learning Goals

Through this assignment, you'll master:

- Designing Java classes and adding instance fields.
- Implementing constructor methods and leveraging getters and setters.
- Printing outputs to the terminal for debugging and gameplay information.
- Utilizing the `main` method to drive your application.
- Understanding scope and dealing with variable shadowing.

### 🚨 Help & Troubleshooting

- Check this week's [issues page](https://gits-15.sys.kth.se/inda-23/help/issues) to see if others are experiencing your problem.
- Create a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) if your problem isn't already listed.
- Seek assistance from a TA during [weekly labs](https://queue.csc.kth.se/Queue/INDA).

Collaboration with peers is encouraged, but sharing solutions is strictly prohibited.

### 🏛 Assignment

Your task is to design a basic game where a player can move around, earn points, and interact with enemies. Start with planning your classes, then proceed to implement them.

#### Exercise 1.0 -- Define the Player Class

Create a class `Player` in your `src` folder. Include:

- **Fields**:
  - `String name`
  - `int score`
  - `int x, y` (coordinates for position)
  - `int health`
  
> If done correctly, your program should compile when applied with the `main` method in Example 1.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int x, y;
      private int health;

      public static void main(String[] args) {
          Player player = new Player();
          player.name = "Hero";
          player.health = 100;
          player.x = 0;
          player.y = 0;

          System.out.println("Name: " + player.name);
          System.out.println("Health: " + player.health);
          System.out.println("Position: (" + player.x + ", " + player.y + ")");
      }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

Encourage encapsulation by offering accessors and mutators for your player's attributes. Make fields `private`, then implement corresponding getters and setters. Ensure your program aligns with Example 2.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int x, y;
      private int health;

      // Getters and Setters

      public static void main(String[] args) {
          Player player = new Player();
          player.setName("Hero");
          player.setHealth(100);
          player.setX(0);
          player.setY(0);

          System.out.println("Name: " + player.getName());
          System.out.println("Health: " + player.getHealth());
          System.out.println("Position: (" + player.getX() + ", " + player.getY() + ")");
      }
  }
  ```
</details>

#### Exercise 1.2 -- Player Constructor

Simplify your instance creation by implementing a constructor method for `Player`. Refactor Example 2 accordingly.

#### Exercise 1.3 -- Introduce an Enemy Class

Add a `Enemy` class with pertinent fields and methods to simulate basic enemy behaviors.

#### Exercise 1.4 -- Movement Method

In `Player`, write a method allowing movement in four directions, subsequently printing current position. Implement Example 3 to validate functionality.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public class Player {
      // Constructor, fields, and methods
      
      public void move(String direction) {
          // Logic to update x and y based on direction
      }

      public static void main(String[] args) {
          Player player = new Player("Hero", 100, 0, 0);
          player.move("right");
          player.move("up");
      }
  }
  ```
</details>

#### Exercise 1.5 -- Scoring System

Develop logic that increases player's score when desirable actions are taken, e.g., collecting an item.

#### Exercise 1.6 -- Enemy Interaction

Implement methods in both `Player` and `Enemy` classes that dictate how they interact (e.g., player taking damage).

#### Exercise 1.7 -- Variable Shadowing

Understand how variable shadowing impacts your code. Observe Example 4 for nuances.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public class GameEntity {
      private String name = "Default";

      public void printName() {
          String name = "Shadowed"; // Shadowing occurs here
          System.out.println(name); // Prints shadowed variable
      }

      public static void main(String[] args) {
          new GameEntity().printName();
      }
  }
  ```
</details>

> **Note:** Utilize the `this` keyword where necessary to refer to fields appropriately.

Through this project, delve deeply into internalizing object-oriented concepts in Java by crafting an interactive gaming experience. Enjoy the code-writing adventure!