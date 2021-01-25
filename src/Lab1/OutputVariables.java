package Lab1;

public class OutputVariables {
    public static void main(String[] args) {
        /* Display Variable Names with the Values */
        double grossSales = 0.0;
        int age = 1;
        boolean finalValue = false;
        int location = 0x11;
        int oldFile = 067;
        char defaultValue = 'a';
        String name = "noname";

        System.out.println("Gross sales = " + grossSales); // Gross Sales has an double type value of 0.0
        System.out.println("Age = " + age); // Age has an int type value of 1
        System.out.println("Final = " + finalValue); // Final is a boolean that's false
        System.out.println("Location = " + location); // Location's value is 0x11
        System.out.println("Old File = " + oldFile); // The Old File has a value of 067
        System.out.println("Default = " + defaultValue); // Default is a char type with a value of 'a'
        System.out.println("Name = " + name); // This is a string type that has a value of noname
    }
}
