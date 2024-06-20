/* 
This program is being used to help students enter their marks of their past semester,find the average and display the result
*/

import java.util.Scanner;

public class SemesterAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      //Prompt the student to enter marks fot unit one
        System.out.print("Enter the marks of the first unit: ");
        double unit1 = scanner.nextDouble();

      //Prompt the student to enter marks for unit two
        System.out.print("Enter the marks of the second unit: ");
        double unit2 = scanner.nextDouble();

      //Prompt the student to enter marks fr unit three 
        System.out.print("Enter the marks of the third unit: ");
        double unit3 = scanner.nextDouble();

      //Prompt the student to enter marks for unit four
        System.out.print("Enter the marks of the fourth unit: ");
        double unit4 = scanner.nextDouble();

      //Prompt the student to enter marks for unit five
        System.out.print("Enter the marks of the fifth unit: ");
        double unit5 = scanner.nextDouble();

      //Calculate the average marks by adding up the five units and dividing them by five
        double average = (unit1 + unit2 + unit3 + unit4 + unit5) / 5;

        System.out.printf("The average of the five units is %.2f.%n", average);
    }
}