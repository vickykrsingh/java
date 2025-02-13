package Arrays;

import java.util.Scanner;

public class RangedPrefixSum {

    static void printArray(int[] arr){
        for(int i = 1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void prefixSumRange(int arr[],int query){
        for(int i = 1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        Scanner sc = new Scanner(System.in);
        while(query-->0){
            System.out.println("Enter Starting And Ending Point : ");
            int startingPoint = sc.nextInt();
            int endingPoint = sc.nextInt();
            int res = arr[endingPoint]-arr[startingPoint-1];
            System.out.println(res);
        }
        sc.close();
    }

    public static void main(String[] args) {
        int q = 3;
        int arr[] = {0,2,3,1,4,5,2,4};
        printArray(arr);
        prefixSumRange(arr, q);
    }
}
