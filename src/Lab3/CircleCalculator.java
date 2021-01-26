package Lab3;
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args){

        double radius, pi, area, diameter, circumference;
        pi = 3.14;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Ask User for Radius
        System.out.print("CIRCLE CALCULATOR\n"
                + "Enter the Radius: ");
        radius = input.nextFloat(); // get radius from user input

        // Calculate and Display Result
        System.out.println("\n-- RESULTS --");
        area = pi * Math.pow(radius,2); // calculate circle's area
        System.out.println("Area: " + area);
        diameter = 2*radius; // calculate circle's diameter
        System.out.println("Diameter: " + diameter);
        circumference = 2 * pi * radius; // calculate circle's circumference
        System.out.println("Circumference: " + circumference);

    }
}
