package Lab6;

public class AverageOverloading {

    // average of 3 integers
    static int average(int a, int b, int c) {
     return (a + b + c)/3;
    }

    // average of 4 integers
    static int average(int a, int b, int c, int d) {
        return (a + b + c + d)/4;
    }

    // average of 5 integers
    static int average(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e)/5;
    }

    // average of 6 integers
    static int average(int a, int b, int c, int d, int e, int f) {
        return (a + b + c + d + e + f)/6;
    }

    public static void main(String[] args) {
        int average3 = average(1,2,3);
        System.out.println("The average of 1, 2, 3 is --> " + average3);
        int average4 = average(4,5,6,7);
        System.out.println("The average of 4, 5, 6, 7 is --> " + average4);
        int average5 = average(8,9,10,11,12);
        System.out.println("The average of 8, 9, 10, 11, 12 is --> " + average5);
        int average6 = average(13,14,15,16,17,18);
        System.out.println("The average of 13, 14, 15, 16, 17, 18 is --> " + average6);

    }
}
