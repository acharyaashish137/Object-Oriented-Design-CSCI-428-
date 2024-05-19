package assignment3;
import java.util.Scanner;

/**
 * This program demonstrates various array operations including appending, merging, and merging sorted arrays.
 * It is designed to show how to manipulate arrays without modifying the original data structures.
 *
 * @author Acharya, Ashish
 * @assignment CSCI 428 Assignment 3-Qn 3
 * @date 03/31/2024
 */
public class Sequence {

    public static void main(String[] args) {
        int[] a = {1, 4, 9, 16};
        int[] b = {9, 7, 4, 9, 11};
        
        // Test append method
        int[] c = append(a, b);
        System.out.println("Append Result: ");
        for (int num : c) {
            System.out.print(num + " ");
        }
        
        // Test merge method
        int[] d = merge(a, b);
        System.out.println("\nMerge Result: ");
        for (int num : d) {
            System.out.print(num + " ");
        }
        
        // Test mergeSorted method
        int[] e = mergeSorted(a, b); // Assuming b is also sorted for the sake of example
        System.out.println("\nMergeSorted Result: ");
        for (int num : e) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] append(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
    
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int x = 0, y = 0, z = 0;
        while (x < a.length && y < b.length) {
            result[z++] = a[x++];
            if (z < result.length) {
                result[z++] = b[y++];
            }
        }
        while (x < a.length) {
            result[z++] = a[x++];
        }
        while (y < b.length) {
            result[z++] = b[y++];
        }
        return result;
    }
    
    public static int[] mergeSorted(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int x = 0, y = 0, z = 0;
        while (x < a.length && y < b.length) {
            if (a[x] < b[y]) {
                result[z++] = a[x++];
            } else {
                result[z++] = b[y++];
            }
        }
        while (x < a.length) {
            result[z++] = a[x++];
        }
        while (y < b.length) {
            result[z++] = b[y++];
        }
        return result;
    }
}
