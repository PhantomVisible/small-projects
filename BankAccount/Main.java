package BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount myAccount = new BankAccount("MA123456", 9999999.0);
        System.out.println("Initial Bank balance: " + myAccount.getBalance());

        System.out.print("Would you like to deposit (+) or withdraw (-)? (type '+' or '-'): ");
        String choice = scanner.nextLine();

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

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
