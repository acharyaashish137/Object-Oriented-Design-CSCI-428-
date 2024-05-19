/**
* Program that reads an integer that is your CWID and breaks it into a sequence of individual digits and print the total and average of the digits
* @author Acharya, Ashish
* @assignment CSCI 428 Assignment 1-Qn 5 
* @date 01/26/ 2024
*/
import java.util.Scanner;

public class IdOperations {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an 8-digit CWID
        System.out.print("Please enter your 8-digit CWID: ");
        int cwid = scanner.nextInt();

        // Break the CWID into individual digits
        int digit1 = cwid / 10000000 % 10;
        int digit2 = cwid / 1000000 % 10;
        int digit3 = cwid / 100000 % 10;
        int digit4 = cwid / 10000 % 10;
        int digit5 = cwid / 1000 % 10;
        int digit6 = cwid / 100 % 10;
        int digit7 = cwid / 10 % 10;
        int digit8 = cwid % 10;

        // Display the individual digits
        System.out.print("The digits are: ");
        System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " "
                + digit5 + " " + digit6 + " " + digit7 + " " + digit8);

        // Calculate the total
        int total = digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8;

        // Display the total
        System.out.println("\nThe total is: " + total);

        // Calculate the average
        double average = (double) total / 8;

        // Display the average
        System.out.println("The average is: " + average);

        scanner.close();
    }

}




