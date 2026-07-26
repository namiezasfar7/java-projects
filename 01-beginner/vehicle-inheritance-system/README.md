# 🚗 Vehicle Inheritance System

A simple Java-based Vehicle Inheritance System that demonstrates the concepts of **multilevel inheritance**, **classes**, **objects**, **constructors**, and **method reuse** in Object-Oriented Programming (OOP). The program models different types of vehicles, including normal vehicles, cars, and electric cars, while sharing common behaviors through inheritance.

---

## 📋 Features

- Creates a base `Vehicle` class with common attributes and methods
- Extends the `Vehicle` class using a `Car` subclass
- Extends the `Car` class using an `ElectricCar` subclass
- Demonstrates multilevel inheritance
- Uses constructors to initialize object attributes
- Reuses parent class methods using inheritance
- Displays vehicle movement, refueling, and charging details

---

## 🛠️ Technologies Used

- Java
- Classes and Objects
- Object-Oriented Programming (OOP)
- Inheritance
- Multilevel Inheritance
- Constructors
- `super` Keyword
- Methods
- Console Output

---

## 📂 Project Structure

```text
Vehicle-Inheritance-System/
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
2. The application creates three vehicle objects:
   - A normal `Vehicle`
   - A `Car`
   - An `ElectricCar`
3. Each object inherits common vehicle properties such as:
   - Brand
   - Speed
   - Movement behavior
4. Additional features are added based on the vehicle type:
   - Cars can refuel.
   - Electric cars can charge.
5. The program displays the details of each vehicle.

---

# 📸 Sample Output

### Scenario 1 - Vehicle Object

```text
Ford is moving at 200 km/h
```

---

### Scenario 2 - Car Object

```text
Toyota is moving at 150 km/h
Toyota is refueling with Diesel
```

---

### Scenario 3 - Electric Car Object

```text
Tesla is moving at 110 km/h
Tesla is refueling with Battery
Tesla is charging. Battery : 50%
```

---

## 🧬 Inheritance Structure

```text
             Vehicle
                |
                |
              Car
                |
                |
          ElectricCar
```

### Vehicle Class
- Brand
- Speed
- Move method

### Car Class
- Inherits Vehicle properties
- Adds fuel type
- Adds refuel method

### ElectricCar Class
- Inherits Car properties
- Adds battery level
- Adds charge method

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Inheritance
- Multilevel Inheritance
- Constructor Chaining using `super()`
- Code Reusability
- Creating and Calling Methods
- Object Relationships
- Console Application Development

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**