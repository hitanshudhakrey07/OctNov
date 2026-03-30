
// import java.util.Scanner;

// public class practice  {
//     public static int sum(int[] arr){
//         int sum = 0;
//         for(int i = 0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner obj = new Scanner(System.in);
//         int N = obj.nextInt();
//         int[] arr = new int[N];

//         for(int i = 0;i<N;i++){
//             arr[i] = obj.nextInt();
//         }
//         int result = sum(arr);
//         System.out.print(result);
//     }
    
// }


// import java.util.Scanner;

// public static void main(String[] args){
//     Scanner obj = new Scanner(System.in);
//     int N = obj.nextInt();
//     int[] arr = new int[N];

//     for(int i=0;i<N;i++){
//         arr[i] = obj.nextInt();
//     }
//     int[]
// }i

//ques002

/*import java.util.Scanner;

public class ques002{
    public static long computeSum(int[] arr){
        long sum = 0;
        for(int ele:arr){
            sum = sum + ele;
            
        }
        return(sum);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];

        for(int  i = 0;i<N;i++){
            arr[i] = obj.nextInt();
        }
        long sum = computeSum(arr);
        System.out.println(sum);
    }
}
    */

//ques003

/*import java.util.Scanner;
public class ques003{
    public static int[] findMaxAndMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:arr){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];

        for(int  i = 0;i<N;i++){ 
            arr[i] = obj.nextInt();
        }
        int[] result = findMaxAndMin(arr);
        int max = result[0];
        int min = result[1];

        System.out.println(max+" "+ min);
    }    
} 
     */

//ques004

// import java.util.Scanner;
// public class ques004{
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int N = obj.nextInt();
//         int[] arr = new int[N];

//         for(int i = 0;i<N;i++){
//             arr[i] = obj.nextInt();

//         }
//         int evenCount1 = 0;
//         int oddCount1 = 0;
//         for(int num:arr){
//             if(num%2==0)  evenCount1++;
//             else oddCount1++;
//         }
//         System.out.println(evenCount1+" "+oddCount1);

//     }
// }

//ques0005


