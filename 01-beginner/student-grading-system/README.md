# 🎓 Student Grading System

A Java-based Object-Oriented Programming project that demonstrates the use of **inheritance**, **method overriding**, and **runtime polymorphism**. The program models different student types, where each student category calculates the final mark using its own grading criteria while sharing a common interface through the `Student` base class.

---

## 📋 Features

- Creates a base `Student` class with a common grading method
- Demonstrates inheritance through multiple student types
- Uses method overriding to implement different grading schemes
- Demonstrates runtime polymorphism using `Student` references
- Calculates final marks for undergraduate, postgraduate, and research students
- Promotes code reusability through inheritance
- Produces clear and formatted console output

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Classes and Objects
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Console Output

---

## 📂 Project Structure

```text
Student-Grading-System/
│── Main.java
│── Student.java
│── UndergraduateStudent.java
│── PostgraduateStudent.java
│── ResearchStudent.java
│── Main.class
│── Student.class
│── UndergraduateStudent.class
│── PostgraduateStudent.class
│── ResearchStudent.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Student.java UndergraduateStudent.java PostgraduateStudent.java ResearchStudent.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application defines assignment and examination marks.
3. It creates three different student objects:
   - Undergraduate Student
   - Postgraduate Student
   - Research Student
4. Each object calculates the final mark using its own grading policy.
5. The program displays the final mark for each student type.

---

# 📸 Sample Output

```text
Undergraduate Student Final Mark : 74.0
Postgraduate Student Final Mark  : 75.0
Research Student Final Mark      : 77.0
```

---

## 🧬 Class Hierarchy

```text
                Student
                    ▲
      ┌─────────────┼─────────────┐
      │             │             │
Undergraduate  Postgraduate  Research
   Student         Student      Student
```

### Student

- Base class
- Defines `calculateFinalMark()`

### UndergraduateStudent

- Inherits `Student`
- Uses **40% Assignment + 60% Examination**

### PostgraduateStudent

- Inherits `Student`
- Uses **50% Assignment + 50% Examination**

### ResearchStudent

- Inherits `Student`
- Uses **70% Assignment + 30% Examination**

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Classes and Objects
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Code Reusability
- Different Business Logic through Polymorphism
- Console Application Development

---

## 🚀 Future Improvements

Possible enhancements include:

- Accept student marks through user input
- Validate mark ranges before calculation
- Assign letter grades based on final marks
- Store multiple students using arrays or `ArrayList`
- Read and write student records using file handling
- Add additional student categories with different grading policies
- Generate student grade reports
- Build a graphical interface using JavaFX or Swing

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**