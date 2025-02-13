package Arrays;

public class PrefixSum {

    static int[] prefixSumBrootForce(int[] arr){
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<=i;j++){
                sum = sum+arr[j];
            }
            ans[k++]=sum;
        }
        return ans;
    }
    static int[] prefixSumWithNewArrayCreation(int[] arr){
        int ans[] = new int[arr.length];
        ans[0] = arr[0];
        for(int i = 1;i<=arr.length-1;i++){
            System.out.println(arr[i-1]+" "+arr[i]);
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
    static void prefixSumWithoutSpace(int arr[]){
        for(int i = 1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,5,2,4};
        prefixSumWithoutSpace(arr);
        printArray(arr);
    }
}
