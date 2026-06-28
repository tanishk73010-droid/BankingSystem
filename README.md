# 🏦 SmartBank - Console Banking System

A clean, light-weight, and interactive console-based Banking System application written in **Java**. This project demonstrates standard Object-Oriented Programming (OOP) concepts, data structures (using `HashMap` for in-memory storage), and robust validations for deposit and withdrawal transactions secured by user-defined PINs.

---

## 🚀 Features

- **Create Account**: Open a new account with a unique account number, holder's name, initial deposit amount, and a secure 4-digit PIN.
- **Check Balance**: Securely query your account balance by providing the account number and PIN.
- **Deposit Money**: Deposit funds into any existing account with input validation (must be positive amounts).
- **Withdraw Money**: Withdraw funds securely. The system validates the account number, security PIN, positive withdrawal limit, and checks for sufficient balance.
- **In-Memory Storage**: Uses a key-value structure (`HashMap`) to manage and update accounts efficiently in real-time.

---

## 📂 Project Structure

```text
Banking System/
│
├── .gitignore
├── Banking System.iml
│
└── src/
    └── Banking/
        ├── Account.java        # Entity class representing a bank account
        ├── BankService.java    # Service class containing transaction logic and validation
        └── Main.java           # Entry point featuring the CLI application menu
```

### Class Details

1. **[`Account.java`](file:///src/Banking/Account.java)**:
   Contains data attributes representing an account such as Account Number, Holder Name, Balance, and security PIN. It encapsulates these fields with standard getters and setters.
2. **[`BankService.java`](file:///src/Banking/BankService.java)**:
   Manages all transactions and operations. It contains a map of account numbers to `Account` objects and implements business rules (e.g., checking PIN match, validating positive amounts, verifying sufficient funds during withdrawals).
3. **[`Main.java`](file:///src/Banking/Main.java)**:
   Serves as the User Interface. Runs an infinite interactive terminal loop with a user selection menu and delegates operations to the `BankService`.

---

## ⚙️ Prerequisites

To run this project, make sure you have:
- **Java Development Kit (JDK)**: Version 8 or higher installed. You can verify your installation by running:
  ```bash
  java -version
  ```

---

## 🛠️ How to Compile & Run

Follow these steps to run the application from your terminal:

### 1. Compile the Project
Open your terminal in the project root directory (`Banking System`) and compile the source files:
```bash
javac -d out src/Banking/*.java
```

### 2. Run the Application
Run the compiled `Main` class using the package path:
```bash
java -cp out Banking.Main
```

---

## 💻 Sample Interaction

```text
Welcome to SmartBank
1. Create Account
2. Check Balance
3. Deposit Money
4. Withdraw Money
5. Exit
Enter your choice (1-5): 1
Enter Account Number: 10101
Enter Account Holder Name: John Doe
Enter Initial Deposit Amount: 5000
Set a 4-digit security PIN: 1234
Account created for John Doe

Welcome to SmartBank
1. Create Account
2. Check Balance
3. Deposit Money
4. Withdraw Money
5. Exit
Enter your choice (1-5): 2
Enter Account Number: 10101
Enter your PIN: 1234
💰 Balance for John Doe: ₹5000.0
```

---

## 📝 License

This project is open-source and free to use. Feel free to modify and build upon it to add features such as database integration, multiple account types, or a graphical user interface!
