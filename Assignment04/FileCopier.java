package assignment04Qn1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopier {
    public static void copyFiles(String sourceFile1, String sourceFile2, String destFile1, String destFile2) {
        // Copy sourceFile1 to destFile1
        copyFileUsingChannel(sourceFile1, destFile1);
        // Copy sourceFile2 to destFile2
        copyFileUsingChannel(sourceFile2, destFile2);
    }

    private static void copyFileUsingChannel(String source, String dest) {
        try (FileChannel sourceChannel = new FileInputStream(source).getChannel();
             FileChannel destChannel = new FileOutputStream(dest).getChannel()) {
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        copyFiles("input.txt", "output.txt", "newInput.txt", "newOutput.txt");
    }
}

