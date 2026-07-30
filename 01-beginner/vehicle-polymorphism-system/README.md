# 🚗 Vehicle Polymorphism System

A simple Java-based Vehicle Polymorphism System that demonstrates the concepts of **multilevel inheritance**, **method overriding**, **runtime polymorphism**, **upcasting**, **downcasting**, and the **`instanceof` operator** in Object-Oriented Programming (OOP). The program models different types of vehicles while showcasing dynamic method dispatch and safe access to subclass-specific methods.

---

## 📋 Features

- Creates a base `Vehicle` class with common attributes and methods
- Extends the `Vehicle` class using a `Car` subclass
- Extends the `Car` class using an `ElectricCar` subclass
- Demonstrates multilevel inheritance
- Demonstrates method overriding using the `move()` method
- Demonstrates runtime polymorphism through a `Vehicle` array
- Uses upcasting to store different vehicle objects in a common array
- Uses `instanceof` for safe downcasting
- Accesses subclass-specific methods (`refuel()` and `charge()`)
- Uses constructors to initialize object attributes
- Uses the `super` keyword for constructor chaining
- Uses the `toString` method for returning default strings

---

## 🛠️ Technologies Used

- Java
- Classes and Objects
- Object-Oriented Programming (OOP)
- Inheritance
- Multilevel Inheritance
- Method Overriding
- Runtime Polymorphism
- Upcasting and Downcasting
- `instanceof` Operator
- Constructors
- `super` Keyword
- Arrays
- `toString` Method
- Enhanced For Loop
- Console Output

---

## 📂 Project Structure

```text
Vehicle-Polymorphism-System/
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
2. The application creates:
   - A `Vehicle` object
   - A `Car` object
   - An `ElectricCar` object
3. All objects are stored in a single `Vehicle` array.
4. The program loops through the array and:
   - Calls the overridden `move()` method using runtime polymorphism.
   - Uses `instanceof` to identify subclass objects.
   - Safely downcasts objects to access subclass-specific methods.
5. The output demonstrates how Java dynamically selects the appropriate method implementation based on the object's actual type.

---

# 📸 Sample Output

```text
Ford is moving at 200 km/h

Toyota is moving at 150 km/h with Fuel Type Diesel
Toyota is refueling with Diesel

Tesla is moving at 110 km/h with Fuel Type Battery and Battery Level 50
Tesla is refueling with Battery
Tesla is charging. Battery : 50%
```

---

## 🧬 Class Hierarchy

```text
             Vehicle
                |
                |
              Car
                |
                |
          ElectricCar
```

---

## 🔄 Polymorphism Flow

```text
Vehicle[] vehicles
        │
        ├── Vehicle
        ├── Car
        └── ElectricCar
                │
                ▼
        vehicle.move()
                │
        Dynamic Method Dispatch
                │
        Correct move() Executes
```

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Multilevel Inheritance
- Constructor Chaining using `super()`
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Upcasting
- Downcasting
- Safe Type Checking using `instanceof`
- Arrays of Objects
- Enhanced For Loops
- To String
- Code Reusability
- Console Application Development

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**