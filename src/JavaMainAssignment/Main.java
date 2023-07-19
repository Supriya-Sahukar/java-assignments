package JavaMainAssignment;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        BankingSystem bankingSystem = new BankingSystem();

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n*****Welcome to XYZ Bank*****");
            System.out.println("1. Create Account");
            System.out.println("2. Make Deposit");
            System.out.println("3. Make Withdrawal");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("0. Exit");
            System.out.println("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch(option)
            {
                case 0: System.out.println("Exiting the program...");
                        System.exit(0);
                case 1: bankingSystem.createAccount(scanner);
                        break;
                case 2: bankingSystem.makeDeposit(bankingSystem,scanner);
                        break;
                case 3: bankingSystem.makeWithdrawal(bankingSystem, scanner);
                        break;
                case 4: bankingSystem.checkBalance(bankingSystem, scanner);
                        break;
                case 5: bankingSystem.makeTransfer(bankingSystem, scanner);
                        break;
                default: System.out.println("Invalid choice");
            }
        }
    }

}
