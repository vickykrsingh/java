package SortingProblem;

public class SortZerosOnesTwoes {
    static int findMaxElementIndex(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void sortZerosOnesTwoes(int[] arr){
        int max = findMaxElementIndex(arr);
        int count[] = new int[max+1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int idx = 0;
        for(int i = 0;i<count.length;i++){
            for(int j = 0;j<count[i];j++){
                arr[idx]=i;
                idx++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0,0};
        sortZerosOnesTwoes(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
