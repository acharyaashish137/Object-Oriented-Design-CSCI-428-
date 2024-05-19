package assignment02;
import java.util.Scanner;
/**
 * Program to compute taxes based on the given table.
 * @author Acharya, Ashish
 * @assignment CSCI 428 Assignment 2 -Qn 2
 * @date 02/11/ 2024
 */
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your marital status (Single or Married): ");
        String maritalStatus = scanner.nextLine();

        System.out.println("Please enter your taxable income:");
        double taxableIncome = scanner.nextDouble();

        double calculatedTax = calculateTax(maritalStatus, taxableIncome);

        System.out.println("Your computed tax is: $" + calculatedTax);

        scanner.close();
    }
    /**
     * Calculates tax based on the given marital status and taxable income.
     * @param status Marital status (Single or Married)
     * @param income Taxable income
     * @return Calculated tax amount
     */
    private static double calculateTax(String status, double income) {
        double tax = 0.0;

        if (status.equalsIgnoreCase("Single")) {
            if (income <= 8000) {
                tax = income * 0.10;
            } else if (income <= 32000) {
                tax = 800 + (income - 8000) * 0.15;
            } else {
                tax = 4400 + (income - 32000) * 0.25;
            }
        } else if (status.equalsIgnoreCase("Married")) {
            if (income <= 16000) {
                tax = income * 0.10;
            } else if (income <= 64000) {
                tax = 1600 + (income - 16000) * 0.15;
            } else {
                tax = 8800 + (income - 64000) * 0.25;
            }
        } else {
            System.out.println("Your marital status is invalid.");
            System.exit(1);
        }

        return tax;
    }
}
