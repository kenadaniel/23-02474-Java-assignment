/*
The program is used to calculate the total number of characters of the users surname and display whether odd or even depending on their age number
*/

import java.util.Scanner;

    public class SurnameAndAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      //Prompt the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

      //Prompt the user to enter their current age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

      //Calculate the number of characters in the surname
        int charCount = surname.length();

      //Print the results
        System.out.println("Then the number of characters is " + charCount + ".");
        System.out.println("Your current age is " + (age % 2 == 0 ? "an even" : "an odd") + "number.");
    }
}