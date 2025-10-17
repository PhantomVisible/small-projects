package student_evaluator;

public class Customer extends Account {
    // Field
    private String fullName;

    // Constructor
    public Customer(String accountId, double balance, String fullName) {
        super(accountId, balance); // call parent constructor
        this.fullName = fullName;
    }

    // Override printAccountInfo to include fullName
    @Override
    public void printAccountInfo() {
        System.out.println("Customer Name: " + fullName);
        super.printAccountInfo(); // call parent method
    }
}
