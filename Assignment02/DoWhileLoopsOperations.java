package assignment02;
import java.util.Scanner;

/**
 * Program that uses do-while loops to perform various tasks.
 * Acharya, Ashish
 * @assignment CSCI 428 Assignment 2 - Qn 4
 * @date 02/11/2024
 */
public class DoWhileLoopsOperations {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user to input two integers: firstNum and secondNum.
        System.out.print("Enter the first integer (must be less than the second integer): ");
        int firstNum = inputScanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNum = inputScanner.nextInt();

        // Closing the scanner
        inputScanner.close();

        // Qn3.d: Output all numbers and their squares between 1 and 10 using do-while loop.
        System.out.println("Numbers and their squares between 1 and 10:");
        int currentNumD = 1;
        do {
            int square = currentNumD * currentNumD;
            System.out.println(currentNumD + " squared is " + square);
            currentNumD++;
        } while (currentNumD <= 10);

        // Qn3.e: Output the sum of squares of odd numbers between firstNum and secondNum inclusive using do-while loop.
        int sumOfOddSquares = 0;
        int currentNumE = firstNum;
        do {
            if (currentNumE % 2 != 0) {
                int square = currentNumE * currentNumE;
                sumOfOddSquares += square;
            }
            currentNumE++;
        } while (currentNumE <= secondNum);
        System.out.println("Sum of squares of odd numbers between " + firstNum + " and " + secondNum + ": " + sumOfOddSquares);

        // Qn3.f: Output all uppercase letters using do-while loop.
        System.out.println("Uppercase letters:");
        char currentLetter = 'A';
        do {
            System.out.print(currentLetter + " ");
            currentLetter++;
        } while (currentLetter <= 'Z');
        System.out.println();
    }
}
