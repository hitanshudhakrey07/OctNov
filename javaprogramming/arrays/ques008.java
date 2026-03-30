package javaprogramming.arrays;
import java.util.Scanner;
public class ques008 {
    public static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp ;
        
        // for(int i = 0;i<N/2;i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of array"+" ");
        int N = obj.nextInt();
        int[] arr = new int[N];

        for(int i = 0;i<N;i++){
            arr[i]=obj.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            swap(arr,left,right);
            left++;
            right--;
        }
        for( int num : arr){
            System.out.println(num+" ");
        }
    }
     
    
}
