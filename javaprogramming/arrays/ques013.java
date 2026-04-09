public class ques013 {
    public static void main(String[] args) {
        
    
        int[] arr = {1,2,3,-3,1};
        int k = 3;
        int count = 0;

        for(int i = 0;i<arr.length;i++){ //pick a element 
            int sum = 0;

            for(int j=i;j<arr.length;j++){ //to traverse an element
                sum+=arr[j];
                if(k==sum){
                    count++;
                }
            }
        
        }
        System.out.println(count);

    }
}
