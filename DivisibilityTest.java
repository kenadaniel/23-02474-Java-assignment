/*
This is a program that will help children learn divisibility tests of numbers of integers
*/

//Declare the scanner class to get the user input
import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      //Prompt user to enter an integer 
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

      for (int i = 2; i <= 9; i++) {
            if (number % i == 0) {
                if (i == 2) {
                    System.out.println("The number is divisible by " + i + " because it is an even number.");
                } else if (i == 5) {
                    int lastDigit = number % 10;
                    if (lastDigit == 5 || lastDigit == 0) {
                        System.out.println("The number is divisible by " + i + " because it ends with a " + lastDigit + ".");
                    } else {
                        System.out.println("The number is divisible by " + i + ".");
                    }
                } else if (i == 3 || i == 9) {
                    int sumOfDigits = sumOfDigits(number);
                    if (sumOfDigits % i == 0) {
                        System.out.println("The number is divisible by " + i + " because the sum of its digits is divisible by " + i + ".");
                    } else {
                        System.out.println("The number is not divisible by " + i + ".");
                    }
                } else {
                    System.out.println("The number is divisible by " + i + ".");
                }
            } else {
                System.out.println("The number is not divisible by " + i + ".");
            }
        }
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number!= 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
     