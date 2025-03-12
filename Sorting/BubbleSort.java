package Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            boolean isSwaped = false;
            for(int j = 0;j<arr.length- i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped=true;
                }
            }
            if(!isSwaped){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,2,3,10,12,15};
        bubbleSort(arr);
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}