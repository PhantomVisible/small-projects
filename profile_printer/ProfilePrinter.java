package profile_printer;

import java.time.Year;

public class ProfilePrinter {

    public static void main(String[] args) {
        // Declare variables
        String fullName = "Amine EL HAOUAT";
        int birthYear = 2001;
        String city = "Fez";

        // Calculate age
        int age = calculateAge(birthYear);

        // Print profile
        printProfile(fullName, age, city);
    }

    // Method to calculate age
    public static int calculateAge(int birthYear) {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    // Method to check if adult (bonus)
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    // Method to print profile
    public static void printProfile(String name, int age, String city) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Bonus: print adult status
        if (isAdult(age)) {
            System.out.println("Status: Adult");
        } else {
            System.out.println("Status: Minor");
        }
    }
}
