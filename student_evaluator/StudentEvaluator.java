package student_evaluator;

import java.util.ArrayList;

public class StudentEvaluator {

    // Declare lists
    static ArrayList<String> names = new ArrayList<String>() {
        {
            add("Sara");
            add("Omar");
            add("Lina");
            add("Yassir");
            add("Nora");
        }
    };

    static ArrayList<Integer> grades = new ArrayList<Integer>() {
        {
            add(18);
            add(9);
            add(13);
            add(5);
            add(12);
        }
    };

    // Method to print pass/fail for each student
    public static void printPassFail() {
        for (int i = 0; i < names.size(); i++) {
            String status = (grades.get(i) >= 10) ? "Passed" : "Failed";
            System.out.println(names.get(i) + ": " + status + " (" + grades.get(i) + ")");
        }
    }

    // Method to find and print the top student
    public static void findTopStudent() {
        int topIndex = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > grades.get(topIndex)) {
                topIndex = i;
            }
        }
        System.out.println("Top performer: " + names.get(topIndex) + " with " + grades.get(topIndex) + " points.");
    }

    // Bonus: Method to count the number of students who passed
    public static int countPassed() {
        int count = 0;
        for (int grade : grades) {
            if (grade >= 10)
                count++;
        }
        return count;
    }

    // Bonus: Method to calculate pass rate as a percentage
    public static double passRate() {
        int passed = countPassed();
        return ((double) passed / names.size()) * 100;
    }

    // Main method to test all functionality
    public static void main(String[] args) {
        System.out.println("Pass/Fail List:");
        printPassFail();

        System.out.println("\nTop Student:");
        findTopStudent();

        System.out.println("\nNumber of students passed: " + countPassed());
        System.out.printf("Pass rate: %.2f%%\n", passRate());
    }
}
