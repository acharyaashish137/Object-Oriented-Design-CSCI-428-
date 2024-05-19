package assignment02;
/*
 *Program to manipulate the user-entered name by extracting and displaying specific substrings.
 * including the first and last letters, first half, second half, and middle letter(s).
 * @author Acharya, Ashish
 * @assignment CSCI 428 Assignment 2 -Qn 1
 * @date 02/10/ 2024
 */
import java.util.Scanner;
public class stringOperations {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner inputScanner = new Scanner(System.in);

        // a. Declaring a string variable and letting the user enter their name
        System.out.print("Enter your name: ");
        String userName = inputScanner.nextLine();

        // b. Extracting the first letter of the name
        char firstChar = userName.charAt(0);
        System.out.println("First letter of your name: " + firstChar);

        // c. Extracting the first and last letters of the name
        char lastChar = userName.charAt(userName.length() - 1);
        System.out.println("First and last letters of your name: " + firstChar + lastChar);

        // d. Extracting all letters except the first and last ones
        String middleLetters = userName.substring(1, userName.length() - 1);
        System.out.println("Except first and last letters of your name: " + middleLetters);

        // e. Extracting the first half of the string
        int nameLength = userName.length();
        String firstHalf = nameLength % 2 == 0 ? userName.substring(0, nameLength / 2) : userName.substring(0, nameLength / 2 + 1);
        System.out.println("First half of your name: " + firstHalf);

        // f. Extracting the second half of the string
        String secondHalf = nameLength % 2 == 0 ? userName.substring(nameLength / 2) : userName.substring(nameLength / 2 + 1);
        System.out.println("Second half of your name: " + secondHalf);

        // g. Extracting the middle letter or middle two letters if the string has even length
        String middle;
        if (nameLength % 2 == 1) {
            middle = userName.substring(nameLength / 2, nameLength / 2 + 1);
        } else {
            middle = userName.substring(nameLength / 2 - 1, nameLength / 2 + 1);
        }
        System.out.println("Middle letters of your name: " + middle);

        // Closing the scanner
        inputScanner.close();
    }
}
