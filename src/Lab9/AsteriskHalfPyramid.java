package Lab9;
import java.util.Scanner;

public class AsteriskHalfPyramid {
    AsteriskHalfPyramid() {
        int asterisk;
        boolean success = false;

        // Create an object of Scanner
        Scanner input = new Scanner(System.in);

        do {
            try {
                do {
                    System.out.print("\nPlease enter number of rows: "); // Ask user for a number
                    asterisk = Integer.parseInt(input.nextLine()); // User input

                    if (asterisk < 2) {
                        System.out.print("[!] INVALID INPUT - Rows must be more than 2.\n"); // display error and ask again
                    } else {
                        for (int i = 1; i <= asterisk; ++i) {
                            for (int j = 1; j <= i; ++j) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }
                } while (asterisk < 2);
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT!");
            }
        }while(!success);
    }

}
