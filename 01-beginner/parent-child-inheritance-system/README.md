# 👨‍👩‍👦 Parent and Child Inheritance System

A simple Java-based Parent and Child Inheritance System that demonstrates the concepts of **single inheritance**, **constructors**, **protected access modifiers**, the **`super` keyword**, and **method reuse** in Object-Oriented Programming (OOP). The program models a parent and child relationship while constructing and displaying a full name.

---

## 📋 Features

- Creates a base `Parent` class with first and last name attributes
- Extends the `Parent` class using a `Child` subclass
- Demonstrates single inheritance
- Uses constructors to initialize object attributes
- Uses the `super` keyword to call the parent constructor
- Accesses inherited attributes using the `super` keyword
- Allows updating names using setter methods
- Displays both parent and child names

---

## 🛠️ Technologies Used

- Java
- Classes and Objects
- Object-Oriented Programming (OOP)
- Single Inheritance
- Constructors
- `super` Keyword
- Protected Access Modifier
- Methods
- Console Output

---

## 📂 Project Structure

```text
Parent-Child-Inheritance-System/
│── Main.java
│── Parent.java
│── Child.java
│── Main.class
│── Parent.class
│── Child.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Parent.java Child.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application creates:
   - A `Parent` object
   - A `Child` object
3. The parent's first and last names are updated using the `setName()` method.
4. The child's middle name is updated using the `setMiddleName()` method.
5. The program displays:
   - The parent's full name
   - The child's complete name including the middle name

---

# 📸 Sample Output

### Parent Object

```text
Name : John Doe
```

---

### Child Object

```text
Full Name : John Man Doe
```

---

## 🧬 Inheritance Structure

```text
          Parent
             |
             |
           Child
```

### Parent Class

- First Name
- Last Name
- `setName()` method
- `printName()` method

### Child Class

- Inherits `Parent`
- Adds middle name
- `setMiddleName()` method
- `printFullName()` method

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Single Inheritance
- Constructor Chaining using `super()`
- Protected Access Modifier
- Accessing Parent Members using `super`
- Setter Methods
- Code Reusability
- Creating and Calling Methods
- Console Application Development

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**