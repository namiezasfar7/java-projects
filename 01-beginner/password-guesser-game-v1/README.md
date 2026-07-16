# 🔐 Password Guesser Game

A simple Java-based Password Guesser Game where the player has **5 attempts** to guess the correct password. The program provides hints by checking the password length, first character, and last character before determining whether the full password is correct.

---

## 📋 Features

- Allows up to **5 password attempts**
- Checks whether the password length is correct
- Verifies the first character
- Verifies the last character
- Gives helpful feedback after each incorrect attempt
- Displays the remaining number of attempts
- Ends immediately when the correct password is entered
- Reveals the correct password when all attempts are used

---

## 🛠️ Technologies Used

- Java
- Scanner Class
- Strings
- Loops (`for`)
- Conditional Statements (`if-else`)
- Boolean Variables

---

## 📂 Project Structure

```text
Password-Guesser-Game/
│── Main.java
│── Main.class
└── README.md
```

---

## ▶️ How to Compile and Run

### Compile

```bash
javac Main.java
```

### Run

```bash
java Main
```

---

## 📖 Usage

1. Run the program.
2. Enter a password guess.
3. The program will:
   - Check whether the password length is correct.
   - Check the first character.
   - Check the last character.
   - If those are correct, verify the complete password.
4. If the password is correct, the game ends successfully.
5. If all 5 attempts are used, the game displays the correct password.

---

# 📸 Sample Output

### Scenario 1 - Correct Password

```text
*********************
PASSWORD GUESSER GAME
*********************
Enter Guess : Java2026
Password Successful!
```

---

### Scenario 2 - Incorrect Length

```text
*********************
PASSWORD GUESSER GAME
*********************
Enter Guess : Java

Incorrect Length!

You have 4 Attempt(s) Left
```

---

### Scenario 3 - Incorrect First Character

```text
*********************
PASSWORD GUESSER GAME
*********************
Enter Guess : java2026

Incorrect First Character!

You have 4 Attempt(s) Left
```

---

### Scenario 4 - Incorrect Last Character

```text
*********************
PASSWORD GUESSER GAME
*********************
Enter Guess : Java2025

Incorrect Last Character!

You have 4 Attempt(s) Left
```

---

### Scenario 5 - Partial Match

```text
*********************
PASSWORD GUESSER GAME
*********************
Enter Guess : Java1236

Correct length, first and last character.
But the password is still incorrect.
You have 4 Attempt(s) Left
```

---

### Scenario 6 - Game Over

```text
*********************
PASSWORD GUESSER GAME
*********************
Enter Guess : Password
Incorrect Length!

You have 0 Attempt(s) Left

Game Over!
The correct password was: Java2026
```

---

## 🎯 Learning Objectives

This project demonstrates:

- User input using the Scanner class
- String comparison using `equals()`
- String methods (`length()` and `charAt()`)
- Boolean variables
- Looping with `for`
- Conditional logic with `if-else`
- Basic game logic
- Input validation

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**