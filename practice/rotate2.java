public class rotate2 {
    public static void print(int[][] arr){
        for(int[] ele : arr){
            for(int ele1 : )
        }
    }
    public static void swap(int[][] ans){
        for(int i = 0;i<ans.length;i++){
            int left = 0;
            int right = ans[0].length - 1;
            while(low<right){
                int temp = ans[i][left];
                ans[i][right] = ans[i][right];
                ans[i][right] = temp;
            }    
        }
    }
    public static void transpose(int[][] arr){
        int[][] ans = new int[arr[0].length][arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                ans[j][i] = arr[i][j];
            }
        }
        print(ans);
        System.out.println();
        swap(ans);
    }
    public static void main(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        System.out.println();
        transpose(arr);

    }
}
