package Lab4;
import java.util.Scanner;

public class ExamProgram {
    public static void main(String[] args) {
        int answer;
        int userScore = 0;
        int totalScore = 5;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Initialize Exam Title
        System.out.println("    ***** E X A M I N A T I O N - Q U E S T I O N S *****\n"
                + "---------------------------------------------------------------");

        // Start of Question #1
        System.out.println("[Q1:] How many bits make a byte?\n"
                + "1. 16 bits                      2. 8 bits\n"
                + "3. 24 bits                      4. 12 bits\n");
        System.out.print("    Enter Your Answer[1-4]: ");
        answer = input.nextInt();

        switch (answer) {
            case 1, 3, 4 -> System.out.println("    Incorrect! The correct answer is 2: 8 bits.");
            case 2 -> {
                System.out.println("    Correct!");
                userScore++;
            }
            default -> System.out.println("    Incorrect! The correct answer is 2: 8 bits.");
        } // End of Question #1
        System.out.println("\n---------------------------------------------------------------");

        // Start of Question #2
        System.out.println("[Q2:] What is the meaning of CPU?\n"
                + "1. Central Processing Unit      2. Critical Processing Unit\n"
                + "3. Crucial Processing Unit      4. Central Printing Unit\n");
        System.out.print("    Enter Your Answer[1-4]: ");
        answer = input.nextInt();

        switch (answer) {
            case 2, 3, 4 -> System.out.println("    Incorrect! The correct answer is 1: Central Processing Unit.");
            case 1 -> {
                System.out.println("    Correct!");
                userScore++;
            }
            default -> System.out.println("    Incorrect! The correct answer is 1: Central Processing Unit.");
        } // End of Question #2
        System.out.println("\n---------------------------------------------------------------");

        // Start of Question #3
        System.out.println("[Q3:] What is the shortcut key for Bold?\n"
                + "1. CTRL+C                       2. CTRL+X\n"
                + "3. CTRL+B                       4. CTRL+V\n");
        System.out.print("    Enter Your Answer[1-4]: ");
        answer = input.nextInt();

        switch (answer) {
            case 1, 2, 4 -> System.out.println("    Incorrect! The correct answer is 3: CTRL+B.");
            case 3 -> {
                System.out.println("    Correct!");
                userScore++;
            }
            default -> System.out.println("    Incorrect! The correct answer is 3: CTRL+B.");
        } // End of Question 3
        System.out.println("\n---------------------------------------------------------------");

        // Start of Question #4
        System.out.println("[Q4:] Which of the following is hardware?\n"
                + "1. Monitor                      2. Program\n"
                + "3. Operating System             4. Microsoft Office\n");
        System.out.print("    Enter Your Answer[1-4]: ");
        answer = input.nextInt();

        switch (answer) {
            case 2, 3, 4 -> System.out.println("    Incorrect! The correct answer is 1: Monitor.");
            case 1 -> {
                System.out.println("    Correct!");
                userScore++;
            }
            default -> System.out.println("    Incorrect! The correct answer is 1: Monitor.");
        } // End of Question 4
        System.out.println("\n---------------------------------------------------------------");

        // Start of Question #5
        System.out.println("[Q5:] What does the abbreviation WWW mean?\n"
                + "1. World Web Wide               2. Wide World Web\n"
                + "3. Web World Wide               4. World Wide Web\n");
        System.out.print("    Enter Your Answer[1-4]: ");
        answer = input.nextInt();

        switch (answer) {
            case 1, 2, 3 -> System.out.println("    Incorrect! The correct answer is 4: World Wide Web.");
            case 4 -> {
                System.out.println("    Correct!");
                userScore++;
            }
            default -> System.out.println("    Incorrect! The correct answer is 4: World Wide Web");
        } // End of Question 5
        System.out.println("\n---------------------------------------------------------------");

        float percentage = (userScore *100.0f) / totalScore;
        System.out.println("Congratulations, you got " + userScore + " answers right!\n"
                + "That is a score of " + percentage + "%.");



    }
}
