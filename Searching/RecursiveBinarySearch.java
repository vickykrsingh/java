package Searching;

public class RecursiveBinarySearch {
    static boolean recursiveBinarySearch(int[] arr,int start,int end,int target){
        if(start>end) return false;
        int mid = start+(end-start)/2;
        if(arr[mid]>target){
            return recursiveBinarySearch(arr, start, mid-1, target);
        }else if(arr[mid]<target){
            return recursiveBinarySearch(arr, mid+1, end, target);
        }else if(arr[mid]==target){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9};
        int target = 5;
        System.out.println(recursiveBinarySearch(arr, 0, arr.length-1,target));
    }
}
