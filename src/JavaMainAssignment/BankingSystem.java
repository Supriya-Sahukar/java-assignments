package JavaMainAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankingSystem {
    Map<Integer, BankAccount> accounts = new HashMap<>();
    int accountNumberGenerator = 1000;

    public void createAccount(Scanner scanner){
        System.out.println("\nCreate Account:");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        if(initialDeposit < 1000)
        {
            System.out.println("Initial deposit amount must be at least 1000");
            return;
        }

        int newAccountNumber = generateAccountNumber();
        System.out.println("Account created successfully!");
        System.out.println("Your account number is " + newAccountNumber);

        System.out.print("Enter a PIN for security: ");
        int pin = scanner.nextInt();

        BankAccount  account = new BankAccount(name, initialDeposit, newAccountNumber, pin);
        accounts.put(newAccountNumber,account);
        System.out.println("PIN created successfully!");
    }

    public int generateAccountNumber(){
        return ++accountNumberGenerator;
    }

    public BankAccount getAccount(int accountNumber){
        return accounts.get(accountNumber);
    }

    public static void makeDeposit(BankingSystem bankingSystem, Scanner scanner) {
        System.out.println("\nMake Deposit:");
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        BankAccount account = bankingSystem.getAccount(accountNumber);

        if (account != null) {
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (account.validatePin(pin)) {
                System.out.print("Enter the deposit amount: $");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else {
                System.out.println("Invalid PIN!");
            }

        } else {
            System.out.println("Invalid account number!");
        }
    }

    public static void makeWithdrawal(BankingSystem bankingSystem, Scanner scanner)
    {
        System.out.println("\nMake Withdrawal:");
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        BankAccount account = bankingSystem.getAccount(accountNumber);

        if(account != null) {
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (account.validatePin(pin)) {
                System.out.print("Enter the Withdrawal amount: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else {
                System.out.println("Invalid PIN.");
            }

        }
        else {
            System.out.println("Invalid account number");
        }
    }

    public static void checkBalance(BankingSystem bankingSystem, Scanner scanner)
    {
        System.out.println("\nCheck Balance:");
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        BankAccount account = bankingSystem.getAccount(accountNumber);

        if(account != null) {
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            if (account.validatePin(pin)) {
                System.out.println("Current balance: $" + account.getBalance());
            } else {
                System.out.println("Invalid PIN.");
            }

        }
        else {
            System.out.println("Invalid account number");
        }
    }

    public static void makeTransfer(BankingSystem bankingSystem, Scanner scanner) {
        System.out.println("\nMake Transfer:");
        System.out.print("Enter your account number: ");
        int sourceAccountNumber = scanner.nextInt();
        BankAccount sourceAccount = bankingSystem.getAccount(sourceAccountNumber);

        if (sourceAccount != null) {
            System.out.print("Enter Your PIN: ");
            int pin = scanner.nextInt();

            if (sourceAccount.validatePin(pin)) {
                System.out.print("Enter recipient's account number: ");
                int recipientAccountNumber = scanner.nextInt();
                BankAccount recipientAccount = bankingSystem.getAccount(recipientAccountNumber);

                if (recipientAccount != null) {
                    System.out.print("Enter the transfer amount: ");
                    double amount = scanner.nextDouble();
                    sourceAccount.transfer(recipientAccount, amount);
                } else {
                    System.out.println("Invalid recipient account number");
                }

            } else {
                System.out.println("Invalid PIN");
            }

        }else {
            System.out.println("Invalid source account number");
        }
    }


}
