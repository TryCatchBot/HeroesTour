import java.util.Scanner;


public class Comparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first number(Integer): ");
        number1 = input.nextInt();




        System.out.print("Enter second Integer: ");
        number2 = input.nextInt();


        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);


        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);


        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);



    }
}
