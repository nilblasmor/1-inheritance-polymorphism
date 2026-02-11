## 📌 Exercise Statement

This module is divided into several exercises to explore key Java concepts. Each exercise is documented and committed following the **Conventional Commits** standard.

### Level 1 — Exercise 1: Musical Instruments

A system is designed to manage musical instruments in a band. All instruments share a name and a price, but each behaves differently when played.

- An **abstract class `Instrument`** is implemented with common attributes and an abstract `play()` method.
- Three subclasses provide specialized behavior:  
  - `WindInstrument`  
  - `StringInstrument`  
  - `PercussionInstrument`
- The `main()` method creates one instance of each instrument type and invokes `play()` to demonstrate polymorphic behavior.

### Level 1 — Exercise 2: Car Class

A `Car` class is created to analyze the behavior of the `static` and `final` modifiers.

- Attributes are defined with different combinations of `static` and `final` to study initialization, mutability, and shared state.
- A **static method** `brake()` is invoked without creating an object.
- A **non-static method** `accelerate()` is called on an instance.
- The differences between shared vs. instance-specific attributes are documented.

---

## ✨ Features

- Creation of class hierarchies with shared and specialized behavior  
- Execution of polymorphic methods  
- Analysis of Java class loading (static vs. instance blocks)  
- Practical understanding of `static` and `final` modifiers in attributes and methods  

---

## 🛠 Technologies

- **Backend**: Java 21 (LTS) 

---

## ## 🚀 Installation & Execution

1. Clone the repository by running `git clone <repository-url>` and navigate to the project folder.

2. Compile all Java source files using `javac -d out src/**/*.java`. This will create `.class` files in the `out` directory.

3. Run the program with `java -cp out Main`. This executes the main program demonstrating the musical instruments and car class exercises.
