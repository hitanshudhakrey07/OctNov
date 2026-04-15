// public class sortZeroesOnes {
//     public static void main(String[] args) {
//         int[] arr = {1,0,0,1,1,0,0,1,0};
//         int n = arr.length;
//         int noOfZeroes = 0;
//         for(int i = 0;i<n;i++){
//             if(arr[i]==0) noOfZeroes++;
//         }
//         for(int i = 0;i<noOfZeroes;i++){
//             arr[i] = 0;
//         }
//         for(int i = noOfZeroes;i<n;i++){
//             arr[i] = 1;
//         }
//     }

// }

//Method 2
public class sortZeroesOnes {
    public static void swap(int[] arr, int i,int j){
       
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 0, 0, 0, 1 };
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            if (arr[i] == 0)
                i++;
            if (arr[j] == 1)
                j--;
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        for (int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}