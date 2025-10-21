package BankAccount;
import java.util.Scanner;

public class Main extends BankAccount {

    public Main(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank System 💰");
        System.out.println("-----------------------------");


        TransactionManager manager = new TransactionManager();

        SavingsAccount savings = new SavingsAccount("SA-001", 9999999.0);
        CheckingAccount checking = new CheckingAccount("CA-002", 3000);
        manager.addAccount(savings);
        manager.addAccount(checking);


        while (true) {

            System.out.print("\nEnter account number (or 'Exit' to quit): ");
            String accountChoice = scanner.nextLine();

            if (accountChoice.equalsIgnoreCase("Exit")) {
                System.out.println("Goodbye! 👋");
                break;
            }

            // Check if account exists using TransactionManager
            BankAccount myAccount = manager.findAccount(accountChoice);

            if (myAccount == null) {
                System.out.println("\nPlease choose from the following:");
                manager.showAllAccounts();
                continue; // go back to start of loop
            }

            System.out.println("\nCurrent balance for " + myAccount.getAccountNumber() + ": $" + myAccount.getBalance());

            System.out.print("Would you like to deposit (+) or withdraw (-)? (type '+' or '-'): ");
            String choice = scanner.nextLine();

            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            if (choice.equalsIgnoreCase("+")) {
                myAccount.deposit(amount);
            } else if (choice.equalsIgnoreCase("-")) {
                myAccount.withdraw(amount);
            } else {
                System.out.println("Invalid choice. Please type '+' or '-'.");
            }


            System.out.println("Balance after operation: " + myAccount.getBalance());
        }

    }
}
