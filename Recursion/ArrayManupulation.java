package Recursion;

public class ArrayManupulation {
    public static void printArrayElementUsingRecursion(int[] arr,int idx){
        if(idx==arr.length-1){
            System.out.print(arr[idx]+" ");
            return;
        }
        System.out.print(arr[idx]+" ");
        printArrayElementUsingRecursion(arr, idx+1);
    }
    public static int findMaxUsingRecursion(int arr[],int idx){
        if (idx==arr.length-1) {
            return arr[idx];
        }
        int smallAns = findMaxUsingRecursion(arr, idx+1);
        if(arr[idx]>smallAns){
            return arr[idx];
        }else{
            return smallAns;
        }
    }
    public static int sumOfElementUsingRecursion(int arr[],int idx){
        if(idx==arr.length){
            return 0;
        }
        return sumOfElementUsingRecursion(arr, idx+1)+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,5,3};
        // printArrayElementUsingRecursion(arr, 0);
        // System.out.println(findMaxUsingRecursion(arr, 0));
        System.out.println(sumOfElementUsingRecursion(arr, 0));
    }
}
