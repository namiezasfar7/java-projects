# 👨‍💼 Employee Payroll Management System v2

A Java-based Object-Oriented Programming project that demonstrates the use of **abstract classes**, **inheritance**, **runtime polymorphism**, and **method overriding**. The program models different employee roles, where each employee type calculates its final salary using its own salary computation logic while sharing common employee attributes and behaviors.

---

## 📋 Features

- Uses an abstract `Employee` class as the base class
- Demonstrates abstraction using an abstract salary calculation method
- Implements inheritance through `Manager`, `Developer`, and `Intern` classes
- Demonstrates runtime polymorphism using an `Employee` array
- Uses method overriding to provide role-specific salary calculations
- Displays employee information in a formatted layout
- Identifies employee types dynamically using reflection (`getClass().getSimpleName()`)
- Overrides the `toString()` method in each subclass

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Abstract Classes
- Inheritance
- Runtime Polymorphism
- Method Overriding
- Constructor Chaining
- Arrays
- Console Output

---

## 📂 Project Structure

```text
employee-payroll-management-system-v2/
│── Main.java
│── Employee.java
│── Manager.java
│── Developer.java
│── Intern.java
│── Main.class
│── Employee.class
│── Manager.class
│── Developer.class
│── Intern.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java Employee.java Manager.java Developer.java Intern.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Compile and run the program.
2. The application creates an array of different employee objects:
   - Manager
   - Developer
   - Intern
3. Each employee object stores its own salary-related information.
4. Using runtime polymorphism, the program:
   - Displays employee details.
   - Identifies the employee type.
   - Calculates the final salary using the overridden `calculateSalary()` method.
5. The calculated salary is displayed for each employee.

---

# 📸 Sample Output

```text
--------------------------------
Employee Type : Manager
Employee ID   : E101
Employee Name : Alice
Basic Salary  : Rs. 80000.0
Final Salary  : 95000.0
--------------------------------

--------------------------------
Employee Type : Developer
Employee ID   : E102
Employee Name : Bob
Basic Salary  : Rs. 70000.0
Final Salary  : 82000.0
--------------------------------

--------------------------------
Employee Type : Developer
Employee ID   : E103
Employee Name : John
Basic Salary  : Rs. 70000.0
Final Salary  : 100000.0
--------------------------------

--------------------------------
Employee Type : Intern
Employee ID   : E104
Employee Name : Charlie
Basic Salary  : Rs. 25000.0
Final Salary  : 30000.0
--------------------------------

--------------------------------
Employee Type : Manager
Employee ID   : E105
Employee Name : Thomas
Basic Salary  : Rs. 80000.0
Final Salary  : 100000.0
--------------------------------
```

---

## 🧬 Class Hierarchy

```text
             Employee (Abstract)
                    ▲
        ┌───────────┼───────────┐
        │           │           │
    Manager    Developer     Intern
```

### Employee (Abstract)

- Employee ID
- Employee Name
- Basic Salary
- `displayDetails()` method
- Abstract `calculateSalary()` method
- Overridden `toString()` method

### Manager

- Inherits `Employee`
- Adds bonus
- Calculates salary as:
  - **Basic Salary + Bonus**

### Developer

- Inherits `Employee`
- Adds overtime hours and hourly rate
- Calculates salary as:
  - **Basic Salary + (Overtime Hours × Hourly Rate)**

### Intern

- Inherits `Employee`
- Adds allowance
- Calculates salary as:
  - **Basic Salary + Allowance**

---

## 🎯 Learning Objectives

This project demonstrates:

- Object-Oriented Programming (OOP)
- Abstract Classes
- Inheritance
- Runtime Polymorphism
- Method Overriding
- Dynamic Method Dispatch
- Constructor Chaining using `super`
- Arrays of Objects
- Overriding `toString()`
- Code Reusability
- Console Application Development

---

## 🚀 Future Improvements

Possible enhancements include:

- Accept employee details through user input
- Store employee records using `ArrayList`
- Save and load employee data using file handling
- Add additional employee roles (e.g., Sales Executive, HR, Consultant)
- Implement tax and deduction calculations
- Generate formatted payroll reports
- Add exception handling for invalid salary inputs
- Build a graphical interface using JavaFX or Swing
- Integrate with a database using JDBC

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**