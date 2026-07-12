# Password Strength Checker ⛔

A password strength checker that gives feedback

## 📋 Features
- Checks length
- Checks uppercase
- Checks minimum digits
- Simple logic

## 🛠️ How to Run
```bash
javac Main.java
java Main
```

## 📖 How to Use
1. Run the program
2. Enter password

## 💡 Concepts Used
- Loops and conditions
- User input validation
- String methods

## 📸 Sample Output
========== TEST CASE 1 ==========
Input:
Hello123

Expected Output:
Password Successful!


========== TEST CASE 2 ==========
Input:
JAVA2026

Expected Output:
Password Successful!


========== TEST CASE 3 ==========
Input:
hello123

Expected Output:
Password must contain at least one uppercase letter!


========== TEST CASE 4 ==========
Input:
Helloabc

Expected Output:
Password must contain at least one digit!


========== TEST CASE 5 ==========
Input:
helloabc

Expected Output:
Password must contain at least one digit and one uppercase letter!


========== TEST CASE 6 ==========
Input:
Hi12

Expected Output:
Password Must have at least 8 Characters!


========== TEST CASE 7 ==========
Input:
12345678

Expected Output:
Password must contain at least one uppercase letter!


========== TEST CASE 8 ==========
Input:
ABCDEFGH

Expected Output:
Password must contain at least one digit!


========== TEST CASE 9 ==========
Input:
A1bcdefg

Expected Output:
Password Successful!


========== TEST CASE 10 ==========
Input:
Password2026

Expected Output:
Password Successful!

## 👤 Author
Namiez Asfar
[GitHub](https://github.com/namiezasfar7)