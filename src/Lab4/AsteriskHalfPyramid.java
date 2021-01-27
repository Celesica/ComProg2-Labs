package Lab4;
import java.util.Scanner;

public class AsteriskHalfPyramid {
    public static void main(String[] args) {
        int asterisk;

        // Create an object of Scanner
        Scanner input = new Scanner(System.in);

        // Print Title of Program
        System.out.print("----- HALF PYRAMID USING * -----\n");

        do {
            System.out.print("\nPlease enter number of rows: "); // Ask user for a number
            asterisk = input.nextInt(); // User input

            if (asterisk < 2) {
                System.out.print("[!] INVALID INPUT - Rows must be more than 2.\n"); // display error and ask again
            } else {
                for(int i = 1; i <= asterisk; ++i) {
                    for(int j = 1; j <= i; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        } while(asterisk < 2);
    }

}
