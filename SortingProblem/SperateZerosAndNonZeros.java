package SortingProblem;

public class SperateZerosAndNonZeros {

    static void seprateZerosAndNonZeros(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,0,2,0,1,5,0};
        seprateZerosAndNonZeros(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
