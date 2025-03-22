package Sorting;

public class QuickSort {
    static void swap(int[] arr,int start,int piviotIndex){
        int temp = arr[start];
        arr[start]=arr[piviotIndex];
        arr[piviotIndex]=temp;
    }
    static int partion(int[] arr,int start,int end){
        int pivot = arr[start];
        int count = 0;
        for(int i = start+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int piviotIndex = start+count;
        swap(arr,start,piviotIndex);
        int i = start,j=end;
        while(i<piviotIndex && j>piviotIndex){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<piviotIndex  && j>piviotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return piviotIndex;
    }
    static void quickSort(int[] arr,int start,int end){
        if(start>=end) return;
        int pi = partion(arr,start,end);
        quickSort(arr, start, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,6,1,9,5,2,7};
        quickSort(arr,0,arr.length-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        };
        System.out.println();
    }
}
