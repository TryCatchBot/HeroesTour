package chapter3.exercise;
/*
3.1
Modify the addition program in Fig. 2.7 to use dialog-based input and output with the
methods of class JOptionPane . Since method showInputDialog returns a String , you must convert
the String the user enters to an int for use in calculations. The static method parseInt of class
Integer (package java.lang ) takes a String argument representing an integer and returns the value
as an int . If the String does not contain a valid integer, the program will terminate with an error.
**/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ComparisonWithJavaGUI {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstInput = JOptionPane.showInputDialog("Enter first Number");
        int number1 = Integer.parseInt(firstInput);

        String secondInput = JOptionPane.showInputDialog("Enter second Number");
        int number2 = Integer.parseInt(secondInput);



        if (number1 == number2)
            JOptionPane.showMessageDialog(null, String.format("%d is equal to %d%n", number1, number2));

        if (number1 != number2)
            JOptionPane.showMessageDialog(null, String.format("%d is not equal to %d%n", number1, number2));

        if (number1 < number2)
            JOptionPane.showMessageDialog(null, String.format("%d is less than %d%n", number1, number2));


        if (number1 > number2)
            JOptionPane.showMessageDialog(null, String.format("%d is greater than %d%n", number1, number2));

        if (number1 <= number2)
            JOptionPane.showMessageDialog(null, String.format("%d is less than or equal to %d%n", number1, number2));


        if (number1 >= number2)
            JOptionPane.showMessageDialog(null, String.format("%d is greater than or equal to %d%n", number1, number2));

    }

}
