public class pairsummethod1 {
    public static void main(String[] args) {
    int[] arr = {2,7,11,15};
    int length = arr.length;
    int target = 123;
    for(int i = 0;i<length;i++){
            for(int j = i+1;j<length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+" "+j);
                }
                else {
                    System.out.println("-1");
                }

            }
        }
    }


    
}
                                             