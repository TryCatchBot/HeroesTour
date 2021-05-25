import java.util.Scanner;

class PalindromeExample{

    public static void main(String[] args) {
        int reverse;
        int sum = 0;
        int temporal;

        int number = 10;//It is the number variable to be checked for palindrome

//        Scanner enterNumber = new Scanner(System.in);
//        System.out.print("Enter number here: ");
//        int number = enterNumber.nextInt();

        temporal = number;


        while(number>0) {

            reverse = number % 10;  //getting remainder

            sum = (sum*10) + reverse;

            number = number/10;
        }

        if(temporal == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}  