package BankAccount;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "$ from Checking account");
        }else   {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + "$ to Checking account");
        }else  {
            System.out.println("Invalid amount");
        }
    }
}
