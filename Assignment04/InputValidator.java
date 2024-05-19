/**
* Program prompting the user for an integer input within the specified range (50 to 1000). 
*
* @author Acharya, Ashish 
* @assignment CSCI 428 Assignment 04 -Qn 2a
* @date 04/17/ 2024
*/
package assignment04Qn1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int size = 0;

	        while (true) {
	            System.out.print("Enter an integer between 50 and 1000: ");
	            try {
	                size = scanner.nextInt(); // Attempt to read an integer

	                // Check if the integer is within the valid range
	                if (size >= 50 && size <= 1000) {
	                    System.out.println("You entered a valid integer within the range: " + size);
	                    break; // Exit the loop if input is valid
	                } else {
	                    System.out.println("Invalid input. The number must be between 50 and 1000. Please enter again.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid integer.");
	                scanner.next(); // Consume the incorrect input to avoid an infinite loop
	            } finally {
	                // This block can be used for cleanup actions if necessary.
	                // Not used in this specific scenario.
	            }
	        }

	        scanner.close();
	    }
	}
