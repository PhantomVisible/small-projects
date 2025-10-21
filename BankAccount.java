package BankAccount;

interface Transactable {
    void withdraw(double amount);
    void deposit(double amount);
}

public abstract class BankAccount implements Transactable {

    double amount, balance;
    String accountNumber;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "$ from balance");
        }else   {
            System.out.println("Invalid amount");
        }

    }

    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + "$ to balance");
        }else  {
            System.out.println("Invalid amount");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {

        return this.balance;
    }

    @Override
    public String toString() {
        return "Account " + accountNumber + " | Balance: " + balance +"$" ;
    }

}
