package Arrays;

public class RotateArrayByKSteps {

    static int[] rotateByKStepsWithSpace(int[] arr, int k){
        int n = arr.length;
        int[] reversedArr = new int[n];
        int rotate = k%n;
        int j = 0;

        for(int i = n-rotate;i<n;i++){
            reversedArr[j++]=arr[i];
        }
        for(int i = 0;i<=n-rotate-1;i++){
            reversedArr[j++]=arr[i];
        }

        return reversedArr;
    }

    static void swap(int[] arr,int start,int end){
        while(start<end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        };
    }

    static void rotateByKStepsWithoutSpace(int[] arr,int k){
        int n = arr.length;
        int rotate = k%n;
        swap(arr,0,n-rotate-1);
        swap(arr, n-k, n-1);
        swap(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,7,3,9,8};
        // int reversedArr[] = rotateByKStepsWithSpace(arr, 2);
        rotateByKStepsWithoutSpace(arr, 3);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
