34
package assignment3;

import java.util.Scanner;

/**
 *This program prompts the user to input the center and a point on the perimeter
 * of a circle and then calculates and outputs the circle's radius, diameter, circumference, and area.

 * @author's Acharya, Ashish
 * @assignment CSCI 428 Assignment 3-Qn 2
 * @date 03/31/2024
 */
public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Prompt for user input
        System.out.print("Enter the x-coordinate of the circle's center: ");
        double centerX = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the circle's center: ");
        double centerY = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of a perimeter point: ");
        double perimeterX = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of a perimeter point: ");
        double perimeterY = scanner.nextDouble();

        // Calculate characteristics
        double radius = calculateRadius(centerX, centerY, perimeterX, perimeterY);
        double diameter = calculateDiameter(radius);
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        // Close scanner to avoid resource leak
        scanner.close();

        // Display results
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Diameter of the circle: " + diameter);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
    }

    // Method to calculate distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the radius of the circle
    public static double calculateRadius(double centerPointX, double centerPointY, double onCircleX, double onCircleY) {
        return calculateDistance(centerPointX, centerPointY, onCircleX, onCircleY);
    }

    // Method to calculate the diameter of the circle
    public static double calculateDiameter(double radius) {
        return 2 * radius;
    }

    // Method to calculate the circumference of the circle
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the area of the circle
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
