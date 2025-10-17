package student_evaluator;

public class Account {

    // Fields
    protected String accountId;
    protected double balance;

    // Constructor
    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Method to print account info
    public void printAccountInfo() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
    }

    // Bonus: deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Bonus: withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

}
