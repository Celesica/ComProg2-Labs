package Lab3;
import javax.swing.JOptionPane;

public class PersonInfoDialog {
    public static void main(String[] args) {
        String title = "Kindly enter your information."; // title screen with instruction
        JOptionPane.showMessageDialog(null,title);
        String name, age, address, number;
        name = JOptionPane.showInputDialog("Name:"); // user name input
        age = JOptionPane.showInputDialog("Age:"); // user age input
        address = JOptionPane.showInputDialog("Address:"); // user address input
        number = JOptionPane.showInputDialog("Contact Number:"); // user number input

        // Display Dialog Pane with User's Info
        String info = "User's Personal Information:\n\n"
                + "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Address: " + address + "\n"
                + "Contact Number: " + String.valueOf(number).replaceFirst("(\\d{4})(\\d{3})(\\d+)", "$1 $2 $3" + "\n");
        JOptionPane.showMessageDialog(null,info);
    }

}
