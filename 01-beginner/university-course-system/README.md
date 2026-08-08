# 🎓 University Management System

A simple Java-based Course Fee Management System that demonstrates **abstraction**, **inheritance**, **polymorphism**, and **method overriding** in Object-Oriented Programming (OOP). The program manages different types of courses and calculates their fees based on the course type, number of credits, and additional fees.

---

## 📋 Features

* Creates an abstract `Course` base class
* Creates specialized course types:

  * Theory Course
  * Practical Course
  * Research Course
* Uses inheritance to extend the `Course` class
* Uses an abstract `calculateFee()` method
* Overrides `calculateFee()` in each subclass
* Uses getters to access course information
* Stores different course objects in a `Course` array
* Demonstrates runtime polymorphism
* Calculates fees based on course type and additional charges

---

## 🛠️ Technologies Used

* Java
* Classes and Objects
* Object-Oriented Programming (OOP)
* Abstraction
* Abstract Classes
* Abstract Methods
* Inheritance
* Polymorphism
* Method Overriding
* Constructors
* Getters
* Arrays
* Enhanced `for` Loop
* Console Output

---

## 📂 Project Structure

```text
university-management-system/
│── Main.java
│── Course.java
│── TheoryCourse.java
│── PracticalCourse.java
│── ResearchCourse.java
│── Main.class
│── Course.class
│── TheoryCourse.class
│── PracticalCourse.class
│── ResearchCourse.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Course.java TheoryCourse.java PracticalCourse.java ResearchCourse.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The program creates three different course objects:

   * `TheoryCourse`
   * `PracticalCourse`
   * `ResearchCourse`
3. All course objects are stored inside a `Course` array.
4. The program uses getters to display:

   * Course code
   * Course name
   * Course credits
5. The overridden `calculateFee()` method is called for each course.
6. Each course calculates its fee according to its own rules.

---

# 💰 Fee Calculation

### Theory Course

The fee is calculated based on the number of credits:

```text
Credits × Rs. 5,000
```

### Practical Course

The fee is calculated using the credits and an additional laboratory fee:

```text
Credits × Rs. 7,000 + Lab Fee
```

### Research Course

The fee is calculated using the credits and an additional research fee:

```text
Credits × Rs. 10,000 + Research Fee
```

---

# 📸 Sample Output

```text
=====================================
Course Code    : C101
Course Name    : Computer Systems
Course Credits : 4
=====================================
Theory Course Fee : Rs. 20000
=====================================

=====================================
Course Code    : C102
Course Name    : Digital Logics
Course Credits : 3
=====================================
Practical Course Fee : Rs. 23000
=====================================

=====================================
Course Code    : C103
Course Name    : AI & ML
Course Credits : 5
=====================================
Research Course Fee : Rs. 55000
=====================================
```

---

## 🧬 Class Structure

```text
                    Course
                  (Abstract)
                      |
        +-------------+-------------+
        |             |             |
        v             v             v
 TheoryCourse   PracticalCourse   ResearchCourse
```

### Course Class

* Course code
* Course name
* Credits
* Getter methods
* Abstract `calculateFee()` method

### TheoryCourse Class

* Inherits from `Course`
* Calculates fees based on credits
* Overrides `calculateFee()`

### PracticalCourse Class

* Inherits from `Course`
* Adds laboratory fee
* Overrides `calculateFee()`

### ResearchCourse Class

* Inherits from `Course`
* Adds research fee
* Overrides `calculateFee()`

---

## 🧠 OOP Concepts Demonstrated

### Abstraction

`Course` is declared as an abstract class and contains the abstract `calculateFee()` method.

```java
public abstract class Course
```

### Inheritance

The specialized course classes inherit from `Course`.

```java
public class TheoryCourse extends Course
```

### Method Overriding

Each subclass provides its own implementation of `calculateFee()`.

```java
@Override
public void calculateFee()
```

### Polymorphism

Different subclass objects are stored inside a `Course` array:

```java
Course[] courses = {
    new TheoryCourse(...),
    new PracticalCourse(...),
    new ResearchCourse(...)
};
```

When this is called:

```java
course.calculateFee();
```

Java determines which overridden method should execute based on the actual object type.

### Encapsulation

Course information is accessed through getter methods such as:

```java
getCourseCode()
getCourseName()
getCredits()
```

---

## 🎯 Learning Objectives

This project demonstrates:

* Classes and Objects
* Abstract Classes
* Abstract Methods
* Inheritance
* Method Overriding
* Runtime Polymorphism
* Constructor Chaining using `super()`
* Getters
* Arrays of Objects
* Enhanced `for` Loops
* Code Reusability
* Basic OOP Design
* Console Application Development

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**