# 👤 Person Address Management System

A Java-based Object-Oriented Programming project that demonstrates the concept of **composition**, where one class contains an object of another class as a part of its structure. The program models people and their addresses by using an `Address` object inside the `Person` class.

---

## 📋 Features

- Creates a separate `Address` class to store location details
- Demonstrates composition relationship between classes
- Uses objects as attributes inside another class
- Initializes objects using parameterized constructors
- Overrides the `toString()` method for object representation
- Displays complete person details including address information
- Demonstrates object relationships in Object-Oriented Programming

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Classes and Objects
- Composition
- Constructors
- Object References
- Method Overriding
- `toString()` Method
- Console Output

---

## 📂 Project Structure

```text
person-address-management-system/
│── Main.java
│── Person.java
│── Address.java
│── Main.class
│── Person.class
│── Address.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Person.java Address.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application creates multiple `Address` objects containing:
   - Street
   - City
   - Country
3. The `Address` objects are assigned to `Person` objects.
4. Each person displays:
   - Name
   - Age
   - Complete address details
5. The program demonstrates how objects can be combined to create more complex structures.

---

# 📸 Sample Output

```text
Name    : Namiez
Age     : 18
Address : Address{ Street : Maitland Place, City : Colombo, Country : Sri Lanka }

---------------------------------------

Name    : Hafiez
Age     : 15
Address : Address{ Street : Anna Nagar, City : Chennai, Country : India }
```

---

## 🧬 Class Relationship

```text
        Address
           |
           |
        contains
           |
           ▼
        Person
```

### Address Class

- Stores location information:
  - Street
  - City
  - Country
- Overrides `toString()` to display address details

### Person Class

- Stores personal information:
  - Name
  - Age
  - Address object
- Uses composition to connect a person with an address
- Displays complete person information

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Composition Relationship
- Object References
- Constructor Initialization
- Encapsulation Basics
- Method Overriding
- `toString()` Method
- Creating Relationships Between Objects
- Console Application Development

---

## 🚀 Future Improvements

Possible enhancements include:

- Add getters and setters for better encapsulation
- Allow users to enter person details dynamically
- Store multiple people using arrays or `ArrayList`
- Add additional details such as phone number and email
- Implement file handling to save person records
- Add validation for user inputs
- Create a database-connected version using JDBC
- Build a GUI application using JavaFX or Swing

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**