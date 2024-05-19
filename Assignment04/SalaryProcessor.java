package assignment04Qn1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SalaryProcessor {
    public static void processSalaries(String inputFile, String outputFile) {
        Map<String, Double> totalSalaries = new HashMap<>();
        Map<String, Integer> countSalaries = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line = reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String rank = parts[2];
                double salary = Double.parseDouble(parts[3].substring(1).replace(",", ""));

                totalSalaries.put(rank, totalSalaries.getOrDefault(rank, 0.0) + salary);
                countSalaries.put(rank, countSalaries.getOrDefault(rank, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            double totalAll = totalSalaries.values().stream().mapToDouble(Double::doubleValue).sum();
            int countAll = countSalaries.values().stream().mapToInt(Integer::intValue).sum();

            for (String rank : totalSalaries.keySet()) {
                double total = totalSalaries.get(rank);
                int count = countSalaries.get(rank);
                double average = total / count;

                writer.write(String.format("Total salary for %s: $%,.2f%n", rank, total));
                writer.write(String.format("Average salary for %s: $%,.2f%n", rank, average));
            }

            double averageAll = totalAll / countAll;
            writer.write(String.format("Total salary for all employees: $%,.2f%n", totalAll));
            writer.write(String.format("Average salary for all employees: $%,.2f%n", averageAll));
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processSalaries("input.txt", "output.txt");
    }
}
