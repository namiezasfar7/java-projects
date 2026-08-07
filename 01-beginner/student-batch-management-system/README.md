# 🎓 Student Batch Management System

A Java-based Object-Oriented Programming project that demonstrates the concept of **aggregation**, where a `Batch` object maintains references to existing `Student` objects. The program models a student batch by grouping multiple students together while allowing each student to exist independently.

---

## 📋 Features

- Creates a `Student` class to store student information
- Creates a `Batch` class to group multiple students
- Demonstrates aggregation between `Batch` and `Student`
- Initializes objects using parameterized constructors
- Uses object references to associate students with a batch
- Displays batch details along with the information of each student
- Demonstrates object relationships in Object-Oriented Programming

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Classes and Objects
- Aggregation
- Constructors
- Object References
- Methods
- Console Output

---

## 📂 Project Structure

```text
student-batch-management-system/
│── Main.java
│── Student.java
│── Batch.java
│── Main.class
│── Student.class
│── Batch.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Student.java Batch.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application creates multiple `Student` objects containing:
   - Student ID
   - Student Name
   - Student Age
3. A `Batch` object is created using references to the student objects.
4. The program displays:
   - Batch ID
   - Batch Name
   - Details of each student in the batch
5. The project demonstrates how aggregation allows one object to reference and manage other independent objects.

---

# 📸 Sample Output

```text
===============================
Batch ID   : B01
Batch Name : DSE261F
===============================
Student 01
Student ID   : S01
Student Name : Sheshanth
Student Age  : 18
===============================
Student 02
Student ID   : S02
Student Name : Lakmina
Student Age  : 18
===============================
```

---

## 🧬 Class Relationship

```text
        Student
           ▲
           │
           │ referenced by
           │
        Batch
```

### Student Class

- Stores student information:
  - Student ID
  - Student Name
  - Student Age
- Displays student details

### Batch Class

- Stores batch information:
  - Batch ID
  - Batch Name
- Maintains references to `Student` objects
- Displays batch and student details

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Aggregation
- Object References
- Constructor Initialization
- Creating Relationships Between Objects
- Method Invocation Between Objects
- Code Organization
- Console Application Development

---

## 🚀 Future Improvements

Possible enhancements include:

- Store students using arrays or `ArrayList`
- Allow users to add or remove students dynamically
- Search students by ID or name
- Display the total number of students in a batch
- Save and load batch information using file handling
- Implement getters and setters for encapsulation
- Integrate with a database using JDBC
- Build a graphical interface using JavaFX or Swing

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**