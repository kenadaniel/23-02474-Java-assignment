/*This is a calculator program that is being used to help the user perform basic operations
The User should be asked to enter a number, then an operation, the program computes the operation and display the output to the computer screen
*/

//Declare the scanner class to get the user input
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

      //Prompt user to enter the first number 
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

      //Prompt the user to enter the first basic operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

      //Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {

           //Addition operation
            case '+':
                result = num1 + num2;
                break;
          //Subtraction operation
            case '-':
                result = num1 - num2;
                break;
          //Multiplication operation
            case '*':
                result = num1 * num2;
                break;
          //Division operation
            case '/':
                if (num2!= 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter +, -, * or /.");
                return;
        }

      //Display the result of operation
        System.out.println("The result is: " + result);
    }
}