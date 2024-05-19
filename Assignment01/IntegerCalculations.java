/**
*Program that prompts the user for two integers and then perform various calculations
*
* @author Acharya, Ashish
* @assignment CSCI 428 Assignment 1 -Qn 4 
* @date 01/26/ 2024
*/

import java.util.Scanner;

	public class IntegerCalculations {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for two integers
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();

	        // a. The sum
	        int sum = num1 + num2;
	        System.out.println("Sum: " + sum);

	        // b. The difference
	        int difference = num1 - num2;
	        System.out.println("Difference: " + difference);

	        // c. The product
	        int product = num1 * num2;
	        System.out.println("Product: " + product);

	        // d. The average
	        double average = (double) (num1 + num2) / 2;
	        System.out.println("Average: " + average);

	        // e. The distance (absolute value of the difference)
	        int distance = Math.abs(difference);
	        System.out.println("Distance: " + distance);

	        // f. The maximum (the larger of the two)
	        int maximum = Math.max(num1, num2);
	        System.out.println("Maximum: " + maximum);

	        // g. The minimum (the smaller of the two)
	        int minimum = Math.min(num1, num2);
	        System.out.println("Minimum: " + minimum);

	        // h. Rectangle calculations
	        int area = num1 * num2;
	        int perimeter = 2 * (num1 + num2);

	        double diagonal = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));

	        System.out.println("Area of the rectangle: " + area);
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	        System.out.println("Length of the diagonal: " + diagonal);

	        scanner.close();
	    }
	}



