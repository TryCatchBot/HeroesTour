package chapter3;
// Fig. 3.6: AccountTest.java
// Using the Account constructor to initialize the name instance
// variable at the time each Account object is created.

import java.util.Scanner;

public class AccountWithConstructorTest {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String initName = input.nextLine();

        // create two Account objects
        AccountWithConstructor account1 = new AccountWithConstructor("Jane Green");
        AccountWithConstructor account2 = new AccountWithConstructor("John Blue");

        // display initial value of name for each Account
        System.out.printf("Account1 name is: %s%n", account1.getName());
        System.out.printf("Account2 name is: %s%n", account2.getName());

    }

} // end class AccountWithConstructorTest
