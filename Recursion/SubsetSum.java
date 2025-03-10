package Recursion;

public class SubsetSum {
    public static int findSubsetSum(int[] arr,int idx,int cur){
        if(arr.length==idx){
            System.out.println(cur);
            return cur;
        }
        int ele = arr[idx];
        findSubsetSum(arr, idx+1, ele+cur);
        findSubsetSum(arr, idx+1, cur);
        return cur;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3};
        findSubsetSum(arr,0,0);
    }
}
