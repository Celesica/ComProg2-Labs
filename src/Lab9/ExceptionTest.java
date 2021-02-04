package Lab9;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("\n===  ArrayIndexOutOfBoundsException===  ");

        try{
        String nums[] = {"one","two","three"};
        for(int i = 0; i <= 3; i++){
            System.out.println(nums[i]);
        }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array Index 3 is out of bounds\n");
        }

        System.out.print("===  Programs to Execute  ===\n"
                + "[1] Circle Calculator\n[2] Person Info Dialog\n[3] Exam Questions\n"
                + "[4] Factorial of Number\n[5] Number to Words\n[6] Half-Pyramid*\n"
                + "[7] Address Book\nSelect your choice: ");
        select = input.nextInt();
        switch(select) {
            case 1:
            // CircleCalculator
            System.out.println("\n===  Circle Calculator ===");
            CircleCalculator circle = new CircleCalculator();
            break;
            case 2:
            // JOptionPane PersonInfoDialog
            System.out.print("\n===  Person Info Dialog ===");
            PersonInfoDialog personInfo = new PersonInfoDialog();
            break;
            case 3:
            // ExamProgram
            System.out.print("\n===  Exam Questions ===");
            ExamProgram examTest = new ExamProgram();
            break;
            case 4:
                // Factorial
                System.out.print("\n===  Factorial of Number ===");
                FactorialNumber factors = new FactorialNumber();
                break;
            case 5:
                // Number to Words
                System.out.print("\n===  Number to Words  ===");
                NumberToWords numWords = new NumberToWords();
                break;
            case 6:
                // Pyramid
                System.out.print("\n===  Half-Pyramid*  ===");
                AsteriskHalfPyramid pyramid = new AsteriskHalfPyramid();
                break;
            case 7:
                // Pyramid
                System.out.print("\n===  Address Book  ===");
                AddressBookTest bookData = new AddressBookTest();
                break;
            }
        }
}
