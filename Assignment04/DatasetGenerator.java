package assignment04Qn1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DatasetGenerator {
    public static void generateDataset(String fileName) {
        String[] ranks = {"entry", "middle", "senior"};
        double[] minSalary = {40000.00, 40000.00, 75000.00};
        double[] maxSalary = {60000.00, 150000.00, 300000.00};

        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing the header row
            writer.write("FirstName LastName Rank Salary\n");

            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                int rankIndex = random.nextInt(ranks.length);
                String rank = ranks[rankIndex];
                double salary = Math.round(100.0 * (minSalary[rankIndex] + (maxSalary[rankIndex] - minSalary[rankIndex]) * random.nextDouble())) / 100.0;

                writer.write(String.format("%s %s %s $%,.2f%n", firstName, lastName, rank, salary));
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        generateDataset("input.txt");
    }
}
