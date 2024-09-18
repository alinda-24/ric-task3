# Mystic Beverages: Brew Your Java Code

For this exercise, you will harness your Java object-oriented skills to design a mystical beverage class. You'll practice fundamental Java concepts, such as encapsulation, constructor methods, and scope, while coding a fictional beverage system.

### 💀 Deadline

This assignment is due on **Friday, October 28th**.

### 👩‍🏫 Instructions

Find complete assignment instructions and submission details in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Please make sure you've completed the following preparatory tasks:

- Complete the readings and exercises in the [OLI Module 3: Understanding Object-Oriented Design](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).
- If you're not registered, go to https://kth.oli.cmu.edu/, sign up, and use the course key `dd1337-ht22`.

> **Assistant's Note:** The OLI materials are critical to understanding this assignment's scope; review them thoroughly.

### ✅ Learning Goals

By the end of this task, you should be able to:

- Design Java classes using instance fields.
- Implement constructor methods for class initialization.
- Develop and use *getters* and *setters* for field encapsulation.
- Output formatted information to the terminal.
- Apply variable scope concepts to avoid shadowing.
- Execute Java applications using the `main` method.

### 🚨 Troubleshooting Guide

If you encounter issues:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have faced similar problems.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title beginning with "Task X: summary of the problem."
3. Seek assistance in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for lab timing.

Discuss with peers but **do not share solutions**!

---

### 🏛 Assignment

Your task is to create a mystical beverage class, a BaseBeverage, detailing its unique properties and brewing potential. Enrich your Java skills by implementing several exercises outlined below.

#### Exercise 1.0 -- Fields

In the [`src`](src) folder, create a new class called `BaseBeverage.java`. Your class should have the following private fields:

- `String name`
- `int volume` (in milliliters)
- `String flavorProfile`
- `boolean isMagical`

Ensure correct field initialization as shown in Example 1.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class BaseBeverage {

    // Declare your fields here!

    public static void main(String[] args) {
      // create a new BaseBeverage object
      BaseBeverage potion = new BaseBeverage();

      // Assign the fields respective values
      potion.name = "Elixir of Clarity";
      potion.volume = 250;
      potion.flavorProfile = "Crisp mint";
      potion.isMagical = true;

      // Print field values
      System.out.println("Name: " + potion.name);
      System.out.println("Volume: " + potion.volume);
      System.out.println("Flavor Profile: " + potion.flavorProfile);
      System.out.println("Is Magical: " + potion.isMagical);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

Incorporate *getters* and *setters* for all fields to facilitate encapsulation. Apply access modifiers and demonstrate their use in a `main` method as seen in Example 2.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class BaseBeverage {

    // Declare private fields here!
    
    // Implement getters and setters here!

    public static void main(String[] args) {
      // create a new BaseBeverage object
      BaseBeverage potion = new BaseBeverage();

      // Utilize setters
      potion.setName("Elixir of Clarity");
      potion.setVolume(250);
      potion.setFlavorProfile("Crisp mint");
      potion.setIsMagical(true);

      // Utilize getters
      System.out.println("Name: " + potion.getName());
      System.out.println("Volume: " + potion.getVolume());
      System.out.println("Flavor Profile: " + potion.getFlavorProfile());
      System.out.println("Is Magical: " + potion.isMagical());
    } // end main method

  } // end class
  ```
</details>

> **Assistant's Note:** For the boolean type field, follow the naming convention of `isMagical()` and `setIsMagical`.

#### Exercise 1.2 -- Constructor

Streamline the creation of beverage objects by implementing a constructor, following the guidelines in the OLI material.

#### Exercise 1.3 -- printInfo() Method

Implement the `printInfo()` method to output all beverage data neatly, as demonstrated in Example 3.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
    // Use constructors when creating objects
    BaseBeverage potion = new BaseBeverage("Elixir of Clarity", 250, "Crisp mint", true);

    // Print beverage information
    potion.printInfo();
  }
  ```

  Example output:
  ```
  > BEVERAGE INFO
  > Name: Elixir of Clarity
  > Volume: 250 ml
  > Flavor Profile: Crisp mint
  > Magical: true
  ```
</details>

#### Exercise 1.4 -- Variable Shadowing

The following examples illustrate variable shadowing. Analyze these to discuss and fix in class.

Example 1:
```java
public class Brew {
    private String name = "Mystic Brew"; // Should be printed

    public void flavor() {
        String name = "Shadow Brew";
        System.out.println(name); // Incorrectly prints
    }

    public static void main(String[] args){
        new Brew().flavor();
    }
}
```

Example 2:
```java
public class Mystic {
  private String type;

  public Mystic(String type) {
    type = type; // Issue here
  }

  public void conjure(){
    String type = "Transient";
    System.out.println(type + " conjured!"); // Incorrect output
  }
}
```

> **Assistant's Note:** Consider *local scope*, *global variables*, and resolving with `this` keyword.

---