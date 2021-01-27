package Lab4;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int number;
        long factorial = 1;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // Print Title of Program
        System.out.print("----- FACTORIAL OF A NUMBER -----\n");

        do {
            System.out.print("\n Please enter number: "); // Ask user for a number
            number = input.nextInt(); // User input

            if (number < 0) { // if input is negative
                System.out.print(" [!] INVALID - Number must not be negative.\n"); // display error and ask again
            } else {
                // Calculate Factorial
                for (int i = 1; i <= number; ++i) {
                    factorial *= i;
                }
            }
        } while (number < 0); // loop if number is negative

        // Display Result
        System.out.println(" The factorial of " + number + " is " + factorial +".\n");




    }

}
