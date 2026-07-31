# 🚗 Abstract Vehicle Management System

A Java-based Object-Oriented Programming project that demonstrates the use of **abstraction**, **inheritance**, **polymorphism**, **method overriding**, and **abstract classes**. The program models different vehicle types, allowing each subclass to implement its own fueling behavior while sharing common vehicle functionality.

---

## 📋 Features

- Uses an abstract `Vehicle` class as the base class
- Demonstrates abstraction using abstract methods
- Implements inheritance through `Car` and `ElectricCar`
- Demonstrates runtime polymorphism using a `Vehicle` array
- Overrides abstract methods in subclasses
- Uses constructor chaining with the `super` keyword
- Displays vehicle movement and fueling behavior
- Overrides the `toString()` method for object representation

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Abstract Classes
- Abstraction
- Inheritance
- Polymorphism
- Method Overriding
- Constructor Chaining
- Arrays
- Console Output

---

## 📂 Project Structure

```text
Abstract-Vehicle-Management-System/
│── Main.java
│── Vehicle.java
│── Car.java
│── ElectricCar.java
│── Main.class
│── Vehicle.class
│── Car.class
│── ElectricCar.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Vehicle.java Car.java ElectricCar.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application creates an array of `Vehicle` objects.
3. The array stores different vehicle types:
   - `Car`
   - `ElectricCar`
4. Using polymorphism, the program calls:
   - `fuelUp()`
   - `move()`
5. Each subclass provides its own implementation of the `fuelUp()` method while sharing the common movement behavior inherited from the `Vehicle` class.

---

# 📸 Sample Output

### Vehicle Operations

```text
Toyota refueling with Petrol
Toyota is moving at 140 km/h

Tesla charging. Battery : 67%
Tesla is moving at 150 km/h
```

---

## 🧬 Class Hierarchy

```text
          Vehicle (Abstract)
                ▲
        ┌───────┴────────┐
        │                │
      Car         ElectricCar
```

### Vehicle (Abstract)

- Brand
- Speed
- `move()` method
- Abstract `fuelUp()` method
- Overridden `toString()` method

### Car

- Inherits `Vehicle`
- Adds fuel type
- Implements `fuelUp()`
- Overrides `toString()`

### ElectricCar

- Inherits `Vehicle`
- Adds battery level
- Implements `fuelUp()`
- Overrides `toString()`

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Abstract Classes
- Abstraction
- Inheritance
- Runtime Polymorphism
- Method Overriding
- Constructor Chaining using `super`
- Arrays of Objects
- Dynamic Method Dispatch
- Overriding `toString()`
- Code Reusability
- Console Application Development

---

## 🚀 Future Improvements

Possible enhancements include:

- Add additional vehicle types such as `Truck` and `Motorcycle`
- Implement interfaces for maintenance and service operations
- Store vehicle information using collections
- Read and write vehicle data using file handling
- Add user interaction through a menu-driven interface
- Implement exception handling for invalid inputs
- Calculate fuel consumption and travel distance
- Build a graphical interface using JavaFX or Swing

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**