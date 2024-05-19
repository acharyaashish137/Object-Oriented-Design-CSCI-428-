package assignment04Qn1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayElementFetcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random array size between 50 and 1000
        int size = random.nextInt(951) + 50; // +50 to shift the minimum value to 50
        int[] numbers = new int[size];

        // Fill the array with random integers (for example purpose: between 0 and size)
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(size);
        }

        System.out.println("Array with " + size + " elements has been created.");

        while (true) {
            System.out.print("Enter the index of the array to retrieve the value: ");
            try {
                int index = scanner.nextInt();

                // Display the value at the given index
                System.out.println("The value at index " + index + " is " + numbers[index]);
                break; // Exit after successful retrieval
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the incorrect input
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of Bounds");
            } finally {
                // This block can be used for cleanup actions if necessary.
                // Not used in this specific scenario.
            }
        }

        scanner.close();
    }
}

