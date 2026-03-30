package javaprogramming.arrays;

import java.util.Scanner;

public class ques006 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = obj.nextInt();
        }
        int index = obj.nextInt();
        int currentValue = obj.nextInt();
        int[] brr = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            System.out.println(i);
            if (i < index) {
                brr[i] = arr[i];
            } else if (i == index) {
                brr[i] = currentValue;
            } else {
                brr[i] = arr[i - 1];
            }
        }
        for (int ele : brr)
            System.out.print(ele + " ");

    }
}
