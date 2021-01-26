package Lab2;

public class IdentifyOddOrEvenNumber {
    public static void main(String[] args) {
        // declare two numbers
        int numberA = 21;
        int numberB = 32;
        String result ="";

        //identify first number
        result = (numberA % 2 == 0)? "even number." : "odd number.";
        System.out.println(numberA + " is an " + result);

        //identify second number
        result = (numberB % 2 == 0)? "even number." : "odd number.";
        System.out.println(numberB + " is an " + result);
    }
}
