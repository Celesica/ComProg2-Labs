package Lab8;

public class Circle extends Shape {

    @Override
    public void getArea() {
        int radius = 4;
        double pi = 3.1416;
        double circleArea = pi * Math.pow(radius,2);
        System.out.print(circleArea);
    }

    @Override
    public void getName() {
        System.out.print("Circle");
    }
}
