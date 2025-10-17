package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = s.nextDouble();

        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = s.nextDouble();

        // Ask for the operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operator = s.next().charAt(0);

        double result; // To store the calculation result

        // Perform the operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero results in an error");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                break;
        }

        s.close();
    }
}
