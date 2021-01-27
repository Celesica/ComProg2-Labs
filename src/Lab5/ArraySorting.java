package Lab5;
import java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        int i, j, temp;

        // Print Title of Program
        System.out.println("-------- SORTING ARRAY --------\n");

        // get Array Length from user
        System.out.print(" Enter the Array Length: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("-------------------------------"); //divider

        //get user Input
        for(i=0;i<length;i++) {
            System.out.print(" Enter Element #" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("-------------------------------"); //divider

        // Ask User to Sort in Ascending or Descending Order
        System.out.print(" [SORT ARRAY]\n '1' =>> Ascending\n '2' =>> Descending\n  Your Choice: ");
        int decision = input.nextInt();

        System.out.println("-------------------------------"); //divider

        switch (decision) {
            case 1 -> { // Sort for Ascending
                for (i = 0; i < (length - 1); i++) {
                    for (j = 0; j < length - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println(" Sorted in Ascending Order:"); // Display Ascending Order
                for (i = 0; i < length; i++)
                    System.out.println("   " + arr[i]);
                System.out.println("-------------------------------"); //divider
            }
            case 2 -> { // Sort for Descending
                for (i = 0; i < (length - 1); i++) {
                    for (j = 0; j < length - i - 1; j++) {
                        if (arr[j] < arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println(" Sorted in Descending Order:"); // Display Descending Order
                for (i = 0; i < length; i++)
                    System.out.println("   " + arr[i]);
                System.out.println("-------------------------------"); //divider
            }
            default -> System.out.println(" You haven't sorted your numbers.");
        }

    }

}
