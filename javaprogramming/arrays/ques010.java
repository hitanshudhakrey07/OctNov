//METHOD 2

public class ques010 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int length = arr.length;
        int target = 50;
        for(int i = 0;i<length;i++){
            for(int j = i+1;j<length;j++){
                if(target==arr[i]+arr[j]) {
                    System.out.println(i+" "+ j);
                  return;
                }    
            }
        }
    }
}

// METHOD 2:
package JavaProgramming.arrays;

import java.util.Scanner;

public class Ques010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int length = arr.length;

        int target = sc.nextInt();

     

        int[] ans = twoSum(arr,length,target);
        for(int ele : ans){
            System.out.print(ele + " ");
        }

        
    }

    public static int[] twoSum(int[] arr,int length,int target){
        for (int i = 0; i < length; i++) {
            int value = target-arr[i];
            int result = findValue(arr,length,value);

            if(result != -1){
                return new int[]{i,result};
            }
        }
        return new int[]{-1,-1};
    }

    public static int findValue(int[] arr,int length,int value){
        int left = 0;
        int right = length-1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == value){
                return mid;
            }
            else if(arr[mid] < value){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}