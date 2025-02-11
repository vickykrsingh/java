package Arrays;

public class SortSquare {

    static int[] sortSquareFunc(int arr[]){
        int i = 0;
        int j = arr.length-1;
        int k = 0;
        int ans[] = new int[arr.length];
        while (i<=j) {
            if (Math.abs(arr[i])>=Math.abs(arr[j])) {
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            if (Math.abs(arr[j])>=Math.abs(arr[i])) {
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {-10,-3,-2,1,4,6,8};
        int ans[] = sortSquareFunc(arr);
        printArray(ans);
    }
}
