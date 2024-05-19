package assignment2;

import java.util.Scanner;

/**
 * Program that uses for loops to perform various tasks.
 * @author Acharya, Ashish
 * @assignment CSCI 428 Assignment 2 -Qn 4
 * @date 02/11/ 2024
 */

public class LoopTasks {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt user to input two integers: firstNum and secondNum.
        System.out.print("Enter the first integer (must be less than the second integer): ");
        int firstNum = inputScanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNum = inputScanner.nextInt();

        // Closing the scanner
        inputScanner.close();

        // Qn3.a: Output all odd numbers between firstNum and secondNum inclusive.
        System.out.println("Odd numbers between " + firstNum + " and " + secondNum + ": ");
        for (int currentNum = firstNum; currentNum <= secondNum; currentNum++) {
            if (currentNum % 2 != 0) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.println();

        // Qn3.b: Output the sum of even numbers between firstNum and secondNum inclusive.
        int sumOfEvens = 0;
        for (int currentNum = firstNum; currentNum <= secondNum; currentNum++) {
            if (currentNum % 2 == 0) {
                sumOfEvens += currentNum;
            }
        }
        System.out.println("Sum of even numbers between " + firstNum + " and " + secondNum + ": " + sumOfEvens);

        // Qn3.c: Output all numbers and their squares between 1 and 10.
        System.out.println("Numbers and their squares between 1 and 10:");
        for (int currentNum = 1; currentNum <= 10; currentNum++) {
            int square = currentNum * currentNum;
            System.out.println(currentNum + " squared is " + square);
        }
    }
}
