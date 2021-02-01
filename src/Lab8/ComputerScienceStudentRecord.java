package Lab8;

public class ComputerScienceStudentRecord extends StudentRecord {
    private double comprogGrade;

    public ComputerScienceStudentRecord() {

    }

    public ComputerScienceStudentRecord(String name, double mathGrade, double englishGrade, double scienceGrade, double comprogGrade) {
        super();
        this.comprogGrade = 0;
    }

    public double getComprogGrade() {
        return comprogGrade;
    }

    public void setComprogGrade(double comprogGrade) {
        this.comprogGrade = comprogGrade;
    }

    public double computeAverageGrade(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade() + getComprogGrade())/4;
    }



}
