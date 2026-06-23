package Banking;

import java.util.HashMap;

public class BankService {

    private final HashMap<Long, Account> accountsMap;

    // Constructor
    public BankService() {
        this.accountsMap = new HashMap<>();
    }


    public void createAccount(long accNumber, String holderName, double initialBalance, String pin) {
        Account newAccount = new Account(accNumber, holderName, initialBalance);
        newAccount.setPin(pin);

        accountsMap.put(accNumber, newAccount);
        System.out.println("Account created for " + holderName);
    }


    private Account findAccount(long accNumber) {
        return accountsMap.get(accNumber);
    }

    public void checkBalance(long accNumber, String enteredPin) {
        Account acc = findAccount(accNumber);

        if (acc == null) {
            System.out.println(" Account not found!");
            return;
        }

        if (acc.getPin().equals(enteredPin)) {
            System.out.println("💰 Balance for " + acc.getHolderName() + ": ₹" + acc.getBalance());
        } else {
            System.out.println("Invalid PIN!");
        }
    }

    // 4. Deposit Money
    public void deposit(long accNumber, double amount) {
        Account acc = findAccount(accNumber);

        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        if (amount <= 0) {
            System.out.println(" Deposit amount must be positive!");
            return;
        }

        double newBalance = acc.getBalance() + amount;
        acc.setBalance(newBalance); // Automatically updates inside the HashMap!
        System.out.println("✅ Deposited ₹" + amount + ". New Balance: ₹" + newBalance);
    }

    // 5. Withdraw Money with validations
    public void withdraw(long accNumber, String enteredPin, double amount) {
        Account acc = findAccount(accNumber);

        if (acc == null) {
            System.out.println("Account not found!");
            return;
        }

        if (!acc.getPin().equals(enteredPin)) {
            System.out.println("Invalid PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
            return;
        }

        if (acc.getBalance() < amount) {
            System.out.println("Insufficient balance! Current Balance: ₹" + acc.getBalance());
            return;
        }

        double newBalance = acc.getBalance() - amount;
        acc.setBalance(newBalance);
        System.out.println("✅ Withdrew ₹" + amount + ". Remaining Balance: ₹" + newBalance);
    }
}