package Sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,4,2,6,3,5,1};
        selectionSort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
