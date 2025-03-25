package Sorting;

public class CountSort {
    static void countSort(int[] arr) {
        // finding maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // count array
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        System.out.println("Count array : ");
        for(int ele : count){
            System.out.print(ele+" ");
        }
        System.out.println();
        // prefix sum 
        for(int i = 1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }
        System.out.println("Prefix Sum : ");
        for(int ele : count){
            System.out.print(ele+" ");
        }
        System.out.println();
        int outputArr[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            outputArr[count[arr[i]]-1]=arr[i];
            count[arr[i]] = count[arr[i]] - 1;
        }
        System.out.println("Sorted Array : ");
        for(int ele : outputArr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 4, 2, 5, 2, 1, 1 };
        countSort(arr);
        // for (int ele : arr) {
        //     System.out.print(ele + " ");
        // }
        // System.out.println();
    }
}
