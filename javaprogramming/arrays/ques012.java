import java.util.Scanner;

public class ques012 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4 };
        int N = arr.length;
        int[] brr = new int[N];
        brr[0] = arr[0];
        int j = 1;
        for(int i = 1;i<N;i++){
            brr[j] = arr[i] + brr[j-1];
            j++;
        }
        for(int ele : brr){
            System.out.print(ele + " ");
        }
    }
}

