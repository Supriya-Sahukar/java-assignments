package JavaMainAssignment;

public class BankAccount {
    String name;
    double balance;
    int accountNumber;
    int pin;

    public BankAccount(String name, double initialDeposit, int accountNumber, int pin){
        this.name = name;
        this.balance = initialDeposit;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public boolean validatePin(int pin){
        return this.pin == pin;
    }

    public void deposit(double amount)
    {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" +amount + " successful.");
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of $" +amount + " successful.");
            } else {
                System.out.println("Insufficient Funds");
            }
        }
        else {
            System.out.println("Invalid Withdrawal amount.");
        }
    }

    public void transfer(BankAccount recipient, double amount){
        if(amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Transfer of $" +amount + " to account number " + recipient.getAccountNumber() + " successful.");
            } else {
                System.out.println("Insufficient Funds");
            }
        }
        else
        {
            System.out.println("Invalid transfer amount.");
        }
    }

}
