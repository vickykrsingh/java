package Searching;

public class BinarySearch {
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }
}
