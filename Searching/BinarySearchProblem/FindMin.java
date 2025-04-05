package Searching.BinarySearchProblem;

public class FindMin {
    static int findMin(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int n = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[n]){
                end=mid-1;
                ans=mid;
            }else if (arr[mid]>arr[n]) {
                start=mid+1;
            }
        }
        return arr[ans];
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(findMin(arr));
    }
}
