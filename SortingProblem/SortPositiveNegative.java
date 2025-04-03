package SortingProblem;

public class SortPositiveNegative {
    static void sortPositiveNegative(int arr[]){
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
            if(arr[i]<0){
                i++;
            }
            if (arr[j]>0) {
                j--;
            }
            if(arr[i]>0 && arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        sortPositiveNegative(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
