package MachineProb1;
import java.util.Scanner;

public class PrimeNumbersMenu {
    public static void main(String[] args) {

        int menuChoice;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Show Menu and Ask for User Option
        String mainMenu = ("""
                **********************************\s
                              MENU         
                     [1] Prime or Composite
                     [2] All Prime Numbers
                     [3] Exit
                     Choose an option ->> \s""");

        do {
            System.out.print(mainMenu);
            menuChoice = input.nextInt();
            System.out.println("**********************************");

            // Menu Options
            switch (menuChoice) {
                case 1 -> { // Start Prime or Composite Selection
                    System.out.print("""
                            ----------------------------------\s
                                     You've Selected
                               -+- IF PRIME OR COMPOSITE -+-
                              Please Enter an Integer: \s"""); // Ask for an integer
                    int numberX = input.nextInt(); // User input

                    // Examine User Input and Print Corresponding Output
                    if (numberX == 0 || numberX == 1) { // if User Input is Zero or 1
                        System.out.println(" " + numberX + " ->> Neither Prime nor Composite");

                    } else if (numberX < -1) { // if User Input less than -1 (Negatives)
                        System.out.println("  " + numberX + " ->> Composite Number");

                    } else { // Other Positive Integers
                        boolean isPrime = true;
                        int i = 2; //
                        while (i <= numberX / 2) {
                            if (numberX % i == 0) {
                                isPrime = false;
                                break;
                            }
                            ++i;
                        }
                        if (isPrime)
                            System.out.println("  " + numberX + " ->> Prime Number");
                        else
                            System.out.println("  " + numberX + " ->> Composite Number");
                    }
                    System.out.println();
                } // End Prime or Composite Selection

                case 2 -> { // Start Display All Prime Numbers
                    System.out.print("""
                        ----------------------------------\s
                                  You've Selected
                         -+- DISPLAY ALL PRIME NUMBERS -+-
                          Please Enter First Integer: \s"""); // Ask for First Integer
                        int numberX = input.nextInt(); // First User Input
                    System.out.print("  Please Enter Second Integer: "); // Ask for Second Integer
                    int numberY = input.nextInt(); // Second User Input
                    System.out.print(" "); // Display spaces only for design

                    // Check and assign which integer is High or Low
                    int low, high, i, j;
                    int flag = 0;
                    low = Math.min(numberX,numberY); // get Lowest Integer
                    high = Math.max(numberX,numberY); // get Highest Integer

                    // Determine and display all Prime numbers between User's two integers
                    if (low < 3) {
                        System.out.print(" " + 2);
                    }
                    for (i = low; i <= high; i++) {
                        for (j = 2; j < i; j++) {
                            if (i % j == 0) {
                                flag = 0;
                                break;
                            } else {
                                flag = 1;
                            }
                        }
                        if (flag == 1) {
                            System.out.print(" " + i); // Display the numbers
                        }
                    }
                    System.out.println("\n");
            } // End Display All Prime Numbers

                case 3 -> System.exit(0); // EXIT. Terminates the program
                default -> System.out.println("INVALID OPTION! Please choose again.\n"
                                            + "----------------------------------"); // Display message error and try again
            }
        }   while (true);
    }

}
