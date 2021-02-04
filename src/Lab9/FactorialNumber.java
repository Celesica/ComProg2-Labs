package Lab9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialNumber {
    FactorialNumber() {
        int number;
        long factorial = 1;
        boolean success = false;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        do {
            try {
                do {
                    System.out.print("\n Please enter number: "); // Ask user for a number
                    number = Integer.parseInt(input.nextLine()); // User input

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
                success = true;
            }catch(NumberFormatException e) {
                System.out.println("INVALID INPUT!");
            }
        }while(!success);




    }

}
