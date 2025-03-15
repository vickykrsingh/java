package Sorting;

public class InsertionSort {

    static void insertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,4,2,6,3,1};
        insertionSort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}