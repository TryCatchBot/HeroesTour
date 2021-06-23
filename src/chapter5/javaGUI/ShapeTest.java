package chapter5.javaGUI;
// Fig. 5.28: ShapesTest.java
// Obtaining user input and creating a JFrame to display Shapes.
import javax.swing.JFrame; //handle the display
import javax.swing.JOptionPane;

public class ShapeTest {

    public static void main(String[] args){

        // obtain user's choice
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw Rectangles\n" +
                        "Enter 2 to draw Oval"
        );

        int choice = Integer.parseInt(input); // convert input to int

        // create the panel with the user's input
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame(); // creates a new JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);

    } //end main method

} // End class ShapeTest
