package assignment02;

import java.util.Scanner;

/**
 * Program that uses for loops to perform various tasks.
 * Acharya, Ashish
 * @assignment CSCI 428 Assignment 2 - Qn 4
 * @date 02/11/2024
 */

public class ForLoopOperations {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user to input two integers: firstNum and secondNum.
        System.out.print("Enter the first integer (must be less than the second integer): ");
        int firstNum = inputScanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNum = inputScanner.nextInt();

        // Closing the scanner
        inputScanner.close();

        // Qn3.a: Prompt the user to input two integers: firstNum and secondNum using for loop.
        // (Note: As Qn3.a is about prompting, it doesn't require a for loop explicitly, so we'll use a simple prompt.)

        // Qn3.b: Output all odd numbers between firstNum and secondNum inclusive using for loop.
        System.out.println("Odd numbers between " + firstNum + " and " + secondNum + ": ");
        for (int currentNumB = firstNum; currentNumB <= secondNum; currentNumB++) {
            if (currentNumB % 2 != 0) {
                System.out.print(currentNumB + " ");
            }
        }
        System.out.println();

        // Qn3.c: Output the sum of even numbers between firstNum and secondNum inclusive using for loop.
        int sumOfEvens = 0;
        for (int currentNumC = firstNum; currentNumC <= secondNum; currentNumC++) {
            if (currentNumC % 2 == 0) {
                sumOfEvens += currentNumC;
            }
        }
        System.out.println("Sum of even numbers between " + firstNum + " and " + secondNum + ": " + sumOfEvens);
    }
}
