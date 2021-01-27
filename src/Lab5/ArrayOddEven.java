package Lab5;

import java.util.Scanner;

public class ArrayOddEven {
        public static void main(String[] args) {

            // create object of Scanner
            Scanner input = new Scanner(System.in);

            // Print Title of Program
            System.out.println("----- ODD & EVEN NUMBERS IN ARRAY -----\n");

            int[] arr = new int[10]; // declare array of 10 numbers

            //get user input
            for(int i=0;i<10;i++) {
                System.out.print(" Enter Element Number " + (i+1) + ": "); // ask user for a number
                arr[i] = input.nextInt(); // store user input into array
            }

            // Find and Display Even Numbers
            System.out.println("\n EVEN NUMBERS:");
            for(int i=0;i<10;i++){
                if(arr[i]%2==0){
                    System.out.println("   " + arr[i]);
                }
            }

            // Find and Display Odd Numbers
            System.out.println("\n ODD NUMBERS:");
            for(int i=0;i<10;i++){
                if(arr[i]%2!=0){
                    System.out.println("   " + arr[i]);
                }
            }

        }
}

