package javaprogramming.arrays;

import java.util.Scanner;

public class ques005 {
    public static int linearSearch(int[] arr, int key){
        for(int num: arr){
            if(num==key){
                return num;
            }
            
        }
        // //for(int i = 0;i<n;i++){
        //   if(arr[i]==key){
        //     return arr[i];
        //   }
          
        // }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = linearSearch(arr,key);
        System.out.println(ans);


    }
}

// int index = -1;
// boolean flag = false;
// for(int i = 0;i<n;i++){
//     if(arr[i]==key){
//         flag = true;
//         index = i;
//         break;

//     }
// }
// if(flag==true){
//     System.out.println(arr[index]);
// }else{
//     System.out.println(index);
// }