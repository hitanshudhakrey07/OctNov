package javaprogramming.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 
  *Problem: Print all elements of an array
  *Given an integer N and an array of N integers ,print all elemnts separated by space
*/
public class ques001 {
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

      // Print the aray elements in a single seprated by space
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < N; i++) {
        sb.append(arr[i]);
        if (i < N - 1) {
          sb.append(" ");
        }

      }
      System.out.println(sb.toString());

    } catch (InputMismatchException e) {
      System.err.println("Error: invalid input type.Excepted integer values.");
    } catch (Exception e) {
      System.err.println("Error: An unexpected error occur" + e.getMessage());
    }

  } 
}
