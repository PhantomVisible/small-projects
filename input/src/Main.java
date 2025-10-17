import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastname = input.nextLine();
        System.out.print("Enter your favorite superhero name: ");
        String superhero = input.nextLine();


        System.out.println("Hello, " + firstname + " " + lastname + " your favorite superhero is: " + superhero);

        input.close();
    }
}