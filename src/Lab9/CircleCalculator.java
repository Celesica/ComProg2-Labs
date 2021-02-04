package Lab9;
import java.util.Scanner;

public class CircleCalculator {

        CircleCalculator() {
        double radius, pi, area, diameter, circumference;
        pi = 3.14;
        boolean success = false;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {
                try {
                        // Ask User for Radius
                        System.out.print("Enter the Radius: ");
                        radius = Float.parseFloat(input.nextLine()); // get radius from user input
                        // Calculate and Display Result
                        System.out.println("\n-- RESULTS --");
                        area = pi * Math.pow(radius,2); // calculate circle's area
                        System.out.println("Area: " + area);
                        diameter = 2*radius; // calculate circle's diameter
                        System.out.println("Diameter: " + diameter);
                        circumference = 2 * pi * radius; // calculate circle's circumference
                        System.out.println("Circumference: " + circumference);
                        success=true;

                } catch (NumberFormatException e){ // implement exception
                        System.out.println("INVALID INPUT!");
                }
        } while(!success);
        }
}
