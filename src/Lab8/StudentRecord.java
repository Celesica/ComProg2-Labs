package Lab8;

public class StudentRecord {
    //these are the attributes
    private String name;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    //this is the constructor
    public StudentRecord(){
        this.name="";
        this.mathGrade=0;
        this.englishGrade=0;
        this.scienceGrade=0;
    }

    //these are the mutators and accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }
    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    //custom method
    public double computeAverageGrade(){
        return (this.mathGrade + this.englishGrade + this.scienceGrade)/3;
    }

}
