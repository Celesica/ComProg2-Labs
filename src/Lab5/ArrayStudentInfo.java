package Lab5;

public class ArrayStudentInfo {
    public static void main(String[] args) {
        String[][] info = {{"010", "John", "Male", "21"},
                {"011", "Mary", "Female", "25"},
                {"012", "Joseph", "Male", "24"},
                {"013", "Peter", "Male", "22"}};

        // Print Title of Program
        System.out.println("*- Student Information List -*\n");

        for(int i=0;i<4;++i) {
            for (int j=0;j<1;++j) {
                System.out.println("ID:     " + info[i][0]);
                System.out.println("Name:   " + info[i][1]);
                System.out.println("Gender: " + info[i][2]);
                System.out.println("Gender: " + info[i][3]);
                System.out.println("---------------------");
            }
        }

    }
}
