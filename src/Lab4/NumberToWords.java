package Lab4;
import java.util.Scanner;

public class NumberToWords {

    // Create Readable Words for Numbers
     private static final String[] thousand = {
            "",
            " Thousand"
    };

    private static final String[] tensNames = {
            "",
            " Ten",
            " Twenty",
            " Thirty",
            " Forty",
            " Fifty",
            " Sixty",
            " Seventy",
            " Eighty",
            " Ninety"
    };

    private static final String[] numNames = {
            "",
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Sixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen"
    };

    String numberLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20){
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " Hundred" + current;
    }

    public String convert(int number) {

        String current = "";
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0){
                String s = numberLessThanOneThousand(n);
                current = s + thousand[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (current);
    }

    public static void main(String[] args) {
        NumberToWords obj = new NumberToWords();

        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        int number;

        // Display Title of Program
        System.out.print("----- NUMBER TO WORDS -----\n");

        do {
            System.out.print("\n Please enter number: "); // Ask user for a number
            number = input.nextInt(); // User input

            if (number < 0 || number == 0 || number > 100000) {
                System.out.println(" [!] INVALID INPUT - Number is out of range!"); // Display Invalid Input
            } else {
                System.out.println(" ==>> " + obj.convert(number)); // Display Readable Words of the User Number
            }

        } while(number < 0 || number == 0 || number > 100000);

    }
}
