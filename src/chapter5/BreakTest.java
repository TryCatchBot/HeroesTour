package chapter5;
// Fig. 5.13: BreakTest.java
// break statement exiting a for statement.

public class BreakTest {

    public static void main(String[] args) {

        int count; // control variable also used after loop terminates

        for (count = 1; count <= 10; count++) { // loop 10 times
            if (count == 5)
                break; // terminates loop if count is 5

            System.out.printf("%d ", count);
        }
        System.out.printf("%nBroke out of the loop at count = %d%n", count);
    }
} // end class BreakTest
