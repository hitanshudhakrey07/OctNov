package javaprogramming.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ques002 {
    // computes the sum of elements in an integer array
    // @param arr the input array
    // @return the sum of all elements as a long to avoid overflow
    public static long computeSum(int[] arr) {
        // compute the sum
        long sum = 0;
        for (long ele : arr) {
            sum += ele;
        }
        return (sum);
    }

    public static void main(String[] args) {
        // use try - with sources to ensure the scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in);) {

            // read the size of the array
            int N = scanner.nextInt();

            // validate N within constraints
            if (N < 1 && N > 1000) {
                System.err.println("Error: N must be between 1 & 1000");
                return;
            }

            // create the array to hold the integer
            int arr[] = new int[N];

            // read an integers into the array
            for (int i = 0; i < N; i++) {
                // Check against Insufficient input
                if (!scanner.hasNextInt()) {
                    System.err.println("Error: Insufficient integers provided:");
                    return;
                }
                arr[i] = scanner.nextInt();
            }
            long sum = computeSum(arr);
            System.out.println(sum);

        } catch (InputMismatchException e) {
            System.err.println("Error: invalid input type.Excepted integer values.");
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occur" + e.getMessage());
        }

    }

}
