package Lab6;
import java.util.Scanner;

public class CircleFormulaMethod {

    public static double circleArea(double r) { //calculate Area
        double pi = 3.14;
        return pi * Math.pow(r,2);
    }

    public static double circleCircumference(double r) { //calculate
        double pi = 3.14;
        return 2*pi*r;
    }

    public static double circleDiameter(double r) {
        return 2*r;
    }

    public static void main(String[] args){

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Ask User for Radius
        System.out.print("----- CIRCLE CALCULATOR -----\n"
                + "Enter the Radius: ");
        double radius = input.nextDouble();
        double area = circleArea(radius);
        System.out.println("\tArea: " + area);
        double circumference = circleCircumference(radius);
        System.out.println("\tCircumference: " + circumference);
        double diameter = circleDiameter(radius);
        System.out.println("\tDiameter: " + diameter);


    }
}
