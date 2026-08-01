# 🎨 Shape Interface System

A Java-based Object-Oriented Programming project that demonstrates the use of **abstract classes**, **interfaces**, **inheritance**, **polymorphism**, and **method overriding**. The program models different geometric shapes, allowing each shape to calculate its area, display its color, draw itself, and resize using interface implementations.

---

## 📋 Features

- Uses an abstract `Shape` class as the base class
- Demonstrates abstraction using abstract methods
- Implements multiple interfaces (`Drawable` and `Resizable`)
- Demonstrates inheritance through `Circle` and `Rectangle`
- Demonstrates runtime polymorphism using a `Shape` array
- Calculates the area of different shapes
- Draws shapes using the `Drawable` interface
- Resizes shapes using the `Resizable` interface
- Overrides the `toString()` method in each subclass

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Abstract Classes
- Interfaces
- Inheritance
- Polymorphism
- Method Overriding
- Arrays
- Math Library (`Math.PI`)
- Console Output

---

## 📂 Project Structure

```text
shape-interface-system/
│── Main.java
│── Shape.java
│── Circle.java
│── Rectangle.java
│── Drawable.java
│── Resizable.java
│── Main.class
│── Shape.class
│── Circle.class
│── Rectangle.class
│── Drawable.class
│── Resizable.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Shape.java Circle.java Rectangle.java Drawable.java Resizable.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application creates an array of `Shape` objects.
3. The array stores different shapes:
   - `Circle`
   - `Rectangle`
4. For each shape, the program:
   - Displays its color.
   - Calculates and prints its area.
   - Draws the shape.
   - Resizes the shape using a scaling factor.
5. Each subclass provides its own implementation of the abstract and interface methods.

---

# 📸 Sample Output

### Circle

```text
Color : Red
Area : 1590.431280879833
Drawing circle with radius 22.5
New Radius : 45.0
```

---

### Rectangle

```text
Color : Blue
Area : 126.0
Drawing rectangle 10.5 x 12.0
New Width  : 21.0
New Height : 24.0
```

---

## 🧬 Class & Interface Hierarchy

```text
                Shape (Abstract)
                      ▲
          ┌───────────┴───────────┐
          │                       │
      Circle                 Rectangle
          ▲                       ▲
          └───────┬───────────────┘
                  │
      Implements Drawable
      Implements Resizable
```

### Shape (Abstract)

- Color attribute
- `displayColor()` method
- Abstract `getArea()` method
- Overridden `toString()` method

### Drawable Interface

- `draw()` method

### Resizable Interface

- `resize(double factor)` method

### Circle

- Inherits `Shape`
- Implements `Drawable`
- Implements `Resizable`
- Calculates circle area
- Draws and resizes a circle

### Rectangle

- Inherits `Shape`
- Implements `Drawable`
- Implements `Resizable`
- Calculates rectangle area
- Draws and resizes a rectangle

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Abstract Classes
- Interfaces
- Multiple Interface Implementation
- Inheritance
- Runtime Polymorphism
- Method Overriding
- Arrays of Objects
- Dynamic Method Dispatch
- Mathematical Calculations using `Math.PI`
- Overriding `toString()`
- Code Reusability
- Console Application Development

---

## 🚀 Future Improvements

Possible enhancements include:

- Add additional shapes such as `Triangle`, `Square`, and `Ellipse`
- Store shapes using Java Collections (`ArrayList`)
- Allow user input for creating custom shapes
- Implement shape comparison based on area
- Add perimeter calculations
- Save and load shape data using file handling
- Implement exception handling for invalid dimensions
- Build a graphical drawing application using JavaFX or Swing

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**