package programming.algorithm.mergesortalgorithm;

public class mergesort {
    public static void mergeSort(int[] arr){
        if(arr.length == 1){
            return ;
        }
            int[] firstPartition = new int[arr.length/2];
            for(int i = 0;i<firstPartition.length;i++){
                firstPartition[i] = arr[i];
            }
            int[] secondPartition= new int[arr.length-arr.length/2];
            for(int j = 0;j<secondPartition.length;j++){
                secondPartition[j] = arr[i+firstPartition.length]; 
            }
            mergeSort
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = obj.nextInt();
             
            mergeSort(arr);
        }


    }
    
}
