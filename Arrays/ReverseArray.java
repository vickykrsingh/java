package Arrays;

public class ReverseArray {

    static int[] reverseWithoutSwap(int arr[]){
        int n = arr.length;
        int []reversedArray = new int[n];
        int j = 0;

        for(int i = arr.length-1;i>=0;i--){
            reversedArray[j++] = arr[i];
        }
        return reversedArray;
    }
    static void reverseWithSwap(int[] arr){
        int i = 0;
        int j = arr.length-1;
        
        while (i<j) {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,13,43,21,6,9,17,2};
        // int reversedArray[] = reverseWithoutSwap(arr);
        reverseWithSwap(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
