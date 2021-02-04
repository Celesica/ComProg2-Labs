package Lab9;
import javax.swing.*;

public class PersonInfoDialog {
    PersonInfoDialog(){
        String name, address, number;
        int age;
        boolean success = false;

        do {
            try {
                String title = "Kindly enter your information."; // title screen with instruction
                JOptionPane.showMessageDialog(null,title);
                name = JOptionPane.showInputDialog("Name:"); // user name input
                age = Integer.parseInt(JOptionPane.showInputDialog("Age:")); // user age input
                address = JOptionPane.showInputDialog("Address:"); // user address input
                number = JOptionPane.showInputDialog("Contact Number:"); // user number input

                // Display Dialog Pane with User's Info
                String info = "User's Personal Information:\n\n"
                        + "Name: " + name + "\n"
                        + "Age: " + age + "\n"
                        + "Address: " + address + "\n"
                        + "Contact Number: " + String.valueOf(number).replaceFirst("(\\d{4})(\\d{3})(\\d+)", "$1 $2 $3" + "\n");
                JOptionPane.showMessageDialog(null,info);
                success=true;
            } catch (NumberFormatException e) {
                System.out.println("\nINVALID INPUT");
            }
        }while(!success);


    }
}
