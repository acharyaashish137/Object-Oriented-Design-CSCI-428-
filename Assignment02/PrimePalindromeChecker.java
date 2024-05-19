package assignment02;
import java.util.Scanner;
/**
 * Program to determine whether a positive integer is a prime number and a palindrome.
 * Acharya, Ashish
 * @assignment CSCI 428 Assignment 2 - Qn 6
 * @date 02/11/2024
 */

public class PrimePalindromeChecker {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Enter a positive number (greater than 0): ");
            userNumber = userInputScanner.nextInt();

            if (userNumber <= 0) {
                System.out.println("Enter a valid positive number");
            }
        } while (userNumber <= 0);

        boolean isPrime = checkForPrime(userNumber);

        if (isPrime) {
            System.out.println(userNumber + " is a Prime Number.");

            boolean isPalindrome = checkForPalindrome(userNumber);

            if (isPalindrome) {
                System.out.println(userNumber + " is also a Palindrome.");
            } else {
                System.out.println(userNumber + " is not a Palindrome.");
            }
        } else {
            System.out.println(userNumber + " is not a Prime Number.");
        }

        userInputScanner.close();
    }

    // Function to check if a number is prime
    public static boolean checkForPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if a number is a Palindrome
    public static boolean checkForPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
