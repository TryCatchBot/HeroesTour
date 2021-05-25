package chapter3;
// Fig. 3.13: NameDialog.java
// Obtaining user input from a dialog.
import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {

        // prompt user to enter name
        String name = JOptionPane.showInputDialog("What's Your Name?");

        // create the message
        String message = String.format("Welcome, %s, to java programming!", name);

        // display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);

    } // end main
} // end class NameDialog
