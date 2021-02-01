package Lab8;

public class Square extends Shape{

    @Override
    public void getArea() {
        int side = 5;
        double squareArea = Math.pow(side,2);
        System.out.print(squareArea);
    }

    @Override
    public void getName() {
        System.out.print("Square");
    }
}
