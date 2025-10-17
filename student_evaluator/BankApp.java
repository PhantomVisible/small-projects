package student_evaluator;

public class BankApp {
  public static void main(String[] args) {
    // Create two Customer objects
    Customer customer1 = new Customer("A001", 5000, "Amine EL HAOUAT");
    Customer customer2 = new Customer("A002", 2500, "Safae Azzam");

    // Display their info
    customer1.printAccountInfo();
    System.out.println(); // blank line
    customer2.printAccountInfo();

    // Bonus: Test deposit and withdraw
    System.out.println("\n--- Transactions ---");
    customer1.deposit(1000);
    customer2.withdraw(3000); // should show insufficient balance
    customer2.withdraw(1000); // successful withdrawal
  }
}
