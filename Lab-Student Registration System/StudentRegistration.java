/*
 *Program to crete Student Registration Menu System.
 * @author Acharya, Ashish
 * @assignment CSCI 428 Lab01
 * @date 03/03/ 2024
 */

import java.util.Scanner;

public class StudentRegistration {
    private static int totalStudents = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    showTotalStudents();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Welcome to Student Registration System");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Show Total Students");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        totalStudents++;
        System.out.println("Student added successfully.");
    }

    private static void deleteStudent() {
        if (totalStudents > 0) {
            totalStudents--;
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("No students to delete.");
        }
    }

    private static void showTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}
