package assignment04Qn1;

import java.io.File;
import java.util.Scanner;

public class DirectoryCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the directory name
        System.out.println("Enter directory name to create:");
        String directoryName = scanner.nextLine();

        // Create a File object with a relative path within the project directory
        File directory = new File(directoryName);

        // Attempt to create the directory
        if (directory.exists()) {
            System.out.println("Directory already exists");
        } else {
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Failed to create directory");
            }
        }
        scanner.close();
    }
}
