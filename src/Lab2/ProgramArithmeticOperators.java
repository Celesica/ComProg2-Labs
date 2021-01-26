package Lab2;

public class ProgramArithmeticOperators {
    public static void main(String[] args) {
        // declare and initialize two integer variables
        int x = 25;
        int y = 5;
        int result;

        // calculate operators
        System.out.println("First Integer  = " + x);
        System.out.println("Second Integer = " + y);
        System.out.println();
        System.out.println("Calculations:");
        result = x + y; // get Sum
        System.out.println("Sum: " + result);
        result = x - y; // get Difference
        System.out.println("Difference: " + result);
        result = x * y; // get Product
        System.out.println("Product: " + result);
        result = x / y; // get Quotient
        System.out.println("Quotient: " + result);
        result = (x + y) / 2; // get Average
        System.out.println("Average: " + result);
        result = Math.max(x,y); // get Max Integer
        System.out.println("Max Integer: " + result);
        result = Math.min(x,y); // get Min Integer
        System.out.println("Min Integer: " + result);
    }
}
