package Arrays;

import java.util.Scanner;

public class SortZeroOnes {

    static void swap(int left,int right,int[] arr){
        arr[left] = arr[left]+arr[right];
        arr[right]=arr[left]-arr[right];
        arr[left]=arr[left]-arr[right];
    }

    static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter array element : ");
        for(int i = 0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    static void sortZeroOnesFunc(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<=j) {
            if (arr[i]==1&&arr[j]==0) {
                swap(i,j,arr);
                i++;
                j--;
            }
            if (arr[i]==0) {
                i++;
            }
            if (arr[j]==1) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = inputArray();
        sortZeroOnesFunc(arr);
        printArray(arr);
    }
}