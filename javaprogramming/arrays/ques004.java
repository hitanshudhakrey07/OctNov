package javaprogramming.arrays;

import java.util.Scanner;

/* 
   * problem:COunt of even and odd number.
   *Given an integer N and an array of N integers ,print all elemnts separated by space 

*/

public class ques004 {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
    }

    // APPROACH 1: using modulo operator
    int evenCount1 = 0;
    int oddCount1 = 0;
    
    for(int num : arr) {
        if(num % 2 == 0) evenCount1++;
        else oddCount1++;
    }

    // APPROACH 2: using bitwise operator
    int evenCount2 = 0;
    int oddCount2 = 0;

    for(int num: arr) {
        if((num & 1) == 0) evenCount2++;
        else oddCount2++;
    }

    System.out.println(evenCount1 + " " + oddCount1);
   }
}
