package Lab8;

public class Lab8Main {
    public static void main(String[] args) {

        // start Student Records
        String name = "Anna Manna";
        double mathGrade = 71.23, englishGrade = 82.34, scienceGrade = 93.45, comprogGrade = 95.67;

        ComputerScienceStudentRecord averageGrade = new ComputerScienceStudentRecord();
        averageGrade.setName(name);
        averageGrade.setMathGrade(mathGrade);
        averageGrade.setEnglishGrade(englishGrade);
        averageGrade.setScienceGrade(scienceGrade);
        averageGrade.setComprogGrade(comprogGrade);

        System.out.printf("\n*******  G R A D E S - O U T P U T  *******\n%s%s%s%s%s%s%s\n\n",
                "\tName\t\t\t: " + averageGrade.getName(),
                "\n\tMath\t\t\t: " + averageGrade.getMathGrade(),
                "\n\tEnglish\t\t\t: " + averageGrade.getEnglishGrade(),
                "\n\tScience\t\t\t: " + averageGrade.getScienceGrade(),
                "\n\tComputer Programming: " + averageGrade.getComprogGrade(),
                "\n---------------------------------------------",
                "\n\tAVERAGE GRADE\t: " + averageGrade.computeAverageGrade());

        // start Shapes
        System.out.print("\n*******  S H A P E S - O U T P U T  *******\n\n");
        // circle area
        Circle mainCircle = new Circle();
        System.out.print("Area of the ");
        mainCircle.getName();
        System.out.print(" is ");
        mainCircle.getArea();
        // square area
        Square mainSquare = new Square();
        System.out.print("\nArea of the ");
        mainSquare.getName();
        System.out.print(" is ");
        mainSquare.getArea();
        System.out.println();


    }

}
