package Banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bank = new BankService();

        while (true) {
            System.out.println("\nWelcome to SmartBank");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    long accNum = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Initial Deposit Amount: ");
                    double initialDeposit = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Set a 4-digit security PIN: ");
                    String pin = scanner.nextLine();

                    bank.createAccount(accNum, name, initialDeposit, pin);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    long checkAcc = scanner.nextLong();
                    scanner.nextLine(); // Clear buffer

                    System.out.print("Enter your PIN: ");
                    String checkPin = scanner.nextLine();

                    bank.checkBalance(checkAcc, checkPin);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    long depAcc = scanner.nextLong();

                    System.out.print("Enter Deposit Amount: ");
                    double depAmount = scanner.nextDouble();

                    bank.deposit(depAcc, depAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    long withAcc = scanner.nextLong();
                    scanner.nextLine(); //

                    System.out.print("Enter PIN: ");
                    String withPin = scanner.nextLine();

                    System.out.print("Enter Withdrawal Amount: ");
                    double withAmount = scanner.nextDouble();

                    bank.withdraw(withAcc, withPin, withAmount);
                    break;

                case 5:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println(" Invalid option! Please choose a number between 1 and 5.");
            }
        }
    }
}
