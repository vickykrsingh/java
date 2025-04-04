package Searching;

public class FindFirstElement {
    static int findFirstRepeatedElement(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int fI = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                fI=mid;
                end=mid-1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return fI;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,3,3,3,4,4,5,5,5,5,6,6,6,7,8,9,9};
        int target = 6;
        System.out.println(findFirstRepeatedElement(arr, target));
    }
}
