package BankAccount;

public class SavingsAccount extends BankAccount {

        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + "$ from Savings");
        }else   {
            System.out.println("Invalid amount");
        }
    }

    @Override
    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + "$ to Savings");
        }else  {
            System.out.println("Invalid amount");
        }
    }

    //add specific logic later (e.g. interest rate)
}

