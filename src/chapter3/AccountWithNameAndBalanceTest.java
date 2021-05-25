package chapter3;
// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.

import java.util.Scanner;

public class AccountWithNameAndBalanceTest {

    public static void main(String[] args) {

        AccountWithNameAndBalance account1 = new AccountWithNameAndBalance("Jane Green", 50.00);
        AccountWithNameAndBalance account2 = new AccountWithNameAndBalance("John Blue", -7.53);

        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for Account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account1 balance %n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1’s balance


        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());


        System.out.print("Enter deposit amount for Account2: "); // prompt
        double depositAmount2 = input.nextDouble(); // obtain user input
        System.out.printf("%nAdding %.2f to account2 balance %n%n", depositAmount2);
        account2.deposit(depositAmount2); // add to account1’s balance


        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }

}
