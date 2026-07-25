# 🎰 Java Slot Machine Game

A simple Java-based Slot Machine Game where players place bets, spin a three-symbol slot machine, and win payouts based on matching symbol combinations. The project demonstrates the use of arrays, random number generation, methods, loops, conditional logic, and Java's enhanced switch expressions.

---

## 📋 Features

- Starts with an initial player balance
- Allows players to place custom bet amounts
- Validates bet amounts before each spin
- Randomly generates slot machine symbols
- Displays the slot machine results
- Awards payouts based on matching symbols
- Different symbols provide different payout multipliers
- Allows multiple rounds until the player quits or runs out of balance
- Displays the final balance when the game ends

---

## 🛠️ Technologies Used

- Java
- Scanner Class
- Random Class
- Arrays
- Methods
- Loops (`while`, `for`)
- Conditional Statements (`if-else`)
- Enhanced Switch Expressions
- String Manipulation

---

## 📂 Project Structure

```text
Java-Slot-Machine-Game/
│── Main.class
│── Main.java
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
2. Start with an initial balance of **$100**.
3. Enter a bet amount.
4. The slot machine spins and displays three random symbols.
5. If matching symbols are found, a payout is awarded based on the symbol and match type.
6. Choose whether to play another round.
7. The game ends when the player quits or their balance reaches **$0**.

---

# 📸 Sample Output

### Scenario 1 - Winning Spin

```text
****************************
    WELCOME TO JAVA SLOTS
Symbols : 🍒 🍉 🥭 🔔 ⭐
****************************

Current Balance  : $100
Place Bet Amount : $20

Spinning ...

**************
 🍒 | 🍒 | 🍒
**************

You Won $60
Do You Want to Play Again [Y/N] : Y
```

---

### Scenario 2 - Losing Spin

```text
Current Balance  : $140
Place Bet Amount : $20

Spinning ...

**************
 🍉 | ⭐ | 🥭
**************

Sorry You Lost This Round!
Do You Want to Play Again [Y/N] : Y
```

---

### Scenario 3 - Invalid Bet

```text
Current Balance  : $50
Place Bet Amount : $100

INSUFFICIENT FUNDS
```

---

### Scenario 4 - Invalid Bet Amount

```text
Current Balance  : $50
Place Bet Amount : $0

Bet must be greater than 0
```

---

### Scenario 5 - Game Over

```text
GAME OVER! Your Final Balance is $180
```

---

## 💰 Payout Multipliers

| Match | 🍒 | 🍉 | 🥭 | 🔔 | ⭐ |
|------|---:|---:|---:|---:|---:|
| Three Matching Symbols | 3× Bet | 4× Bet | 5× Bet | 10× Bet | 20× Bet |
| Two Matching Symbols | 2× Bet | 3× Bet | 4× Bet | 5× Bet | 10× Bet |

---

## 🎯 Learning Objectives

This project demonstrates:

- User input using the Scanner class
- Random number generation
- Arrays
- Methods and modular programming
- Looping with `while` and `for`
- Conditional logic with `if-else`
- Enhanced switch expressions
- String manipulation using `String.join()`
- Basic game development concepts
- Console application development

---

## 👤 Author

**Namiez Asfar**

GitHub: **https://github.com/namiezasfar7**