package TargetSum;

public class secondLargestElement {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,8,5,6,9};
        int max = findMax(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        System.out.println(secondMax);
        
    }
}
