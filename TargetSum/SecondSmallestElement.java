package TargetSum;

public class SecondSmallestElement {
    static int smallestElement(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,3,5,6,7,9,8};
        int min = smallestElement(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondMin = smallestElement(arr);
        System.out.println(secondMin);

    }
}
