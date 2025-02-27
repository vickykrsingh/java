package TwoDArray;

public class TwoDSubArraySum {
    public static void subArraySum(int arr[][],int r1,int c1,int r2,int c2){
        int sum = 0;
        for(int i = r1;i<=r2;i++){
            for(int j = c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("sum is : "+sum);
    }
    public static void printArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void prefixSumArr(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 1;j<arr.length;j++){
                arr[i][j] = arr[i][j]+arr[i][j-1];
            }
        }
    }
    public static void prefixSumColWiseArr(int arr[][]){
        for(int i = 1;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
    }
    public static void subArrayPrefixSum(int[][] arr,int r1,int c1,int r2,int c2){
        int sum = 0;
        for(int i = r1;i<=r2;i++){
            sum+=arr[i][c2]-arr[i][c1-1];
        }
        System.out.println("sum of this is : "+sum);
    }
    public static void subArrayPrefixSumWithoutLoop(int arr[][],int r1,int c1,int r2,int c2){
        int totalSum = 0;
        totalSum = arr[r2][c2];
        int up = 0;
        if(r1>=1)
        up = arr[r1-1][c2];
        int left = 0;
        if(c1>=1)
        left = arr[r2][c1-1];
        int common = 0;
        if(r1>=1 && c1>=1)
        common = arr[r1-1][c1-1];

        int sum = totalSum-(up+left)+common;
        System.out.println("sum is : "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,2},{1,4,2,5},{4,6,4,7},{5,3,6,7}};
        prefixSumArr(arr);
        printArray(arr);
        System.out.println();
        prefixSumColWiseArr(arr);
        printArray(arr);
        System.out.println();
        int r1 = 0;
        int c1 = 0;
        int r2 = 3;
        int c2 = 0;
        subArrayPrefixSumWithoutLoop(arr,r1,c1,r2,c2);
        // subArrayPrefixSum(arr, r1, c1, r2, c2);
        // // printArray(arr);
        // // subArraySum(arr, r1, c1, r2, c2);
    }
}
