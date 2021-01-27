package Lab5;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // Print Title of Program
        System.out.println("----- FIND MINIMUM & MAXIMUM NUMBER IN ARRAY -----\n");

        int minNum, maxNum; // declare min and max
        int[] arr = new int[10]; // declare array of 10 numbers

        //get user input
        for(int i=0;i<10;i++) {
            System.out.print(" Enter Element Number " + (i+1) + ": "); // ask user for a number
            arr[i] = input.nextInt(); // store user input into array
        }

        minNum=arr[0];// assume first input as smallest value
        maxNum=arr[0];// assume first input as largest value

        for(int i=0; i<10; i++){
            if(minNum>arr[i]){// loop to find minimum number
                minNum=arr[i];
            }
            if(maxNum<arr[i]){
                maxNum=arr[i];  // loop to find maximum number
            }
        }

        System.out.print("\n  Minimum Number: "+minNum);
        System.out.println("\n  Maximum Number: "+maxNum);

    }
}
