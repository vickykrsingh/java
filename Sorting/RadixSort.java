package Sorting;

public class RadixSort {
    public static void countSort(int arr[],int place){
        int count[] = new int[10];
        int outputArr[] = new int[arr.length];
        // finding ones place and putting count of each element with corrosponding count array index
        for(int i = 0;i<arr.length;i++){
            int ones = (arr[i]/place)%10;
            count[ones]++;
        }
        // finding prefix sum of count
        for(int i = 1;i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }
        // sort the array according to ones place
        for(int i = arr.length-1;i>=0;i--){
            int ones = (arr[i]/place)%10;
            // System.out.print(ones+" ");
            outputArr[count[ones]-1] = arr[i];
            count[ones]--;
        }
        for(int i = 0;i<arr.length;i++){
            arr[i]=outputArr[i];
        }
    }
    static void radixSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // System.out.println(max);
        for(int place = 1;max/place>0;place*=10){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        int arr[] = {702,102,892,935,63,4};
        radixSort(arr);
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        };
        System.out.println();
        System.out.println();
    }
}
