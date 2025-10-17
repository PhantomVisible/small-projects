package BankAccount;

public class BankAccount {

    String accountNumber; double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + "$ to balance");
        }else  {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + "$ from balance");
        }else   {
            System.out.println("Invalid amount");
        }
    }
    public double getBalance() {
        return this.balance;
    }

}
