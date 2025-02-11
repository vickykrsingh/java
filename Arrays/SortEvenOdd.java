package Arrays;

import java.util.Scanner;

public class SortEvenOdd {
    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter Array Element : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        sc.close();
        return arr;
    }
    static void swap(int left,int right,int[] arr){
        arr[left] = arr[left]+arr[right];
        arr[right]=arr[left]-arr[right];
        arr[left]=arr[left]-arr[right];
    }
    static int[] sortEvenOdd(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<=j) {
            if(arr[i]%2==1&&arr[j]%2==0){
                swap(i, j, arr);
                i++;
                j--;
            }
            if (arr[i]%2==0) {
                i++;
            }
            if (arr[j]%2==1) {
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = inputArray();
        sortEvenOdd(arr);
        printArray(arr);
    }
}
