package javaprogramming.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ques003 {
    /*
      * find the maximum and minimum value in an integer array
      * @paramarr the input array(must contain atleast one element)
      * @return an array of two integers: [max,min]
    */
    public static int[] findMaxAndMin(int[] arr){
        // Initialize with extreme values
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Iterate through the array to find max and min

        for(int num:arr){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        return new int[]{max,min};
        

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
            //find maximum and minimum
            int[] result = findMaxAndMin(arr);
            int max = result[0];
            int min = result[1];
            //output the result
            System.out.println(max + " " + min); 
        }
        catch (InputMismatchException e) {
            System.err.println("Error: invalid input type.Excepted integer values.");
        } catch (Exception e) {
            System.err.println("Error: An unexpected error occur" + e.getMessage());
        }
    }
    
}
