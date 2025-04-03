package SortingProblem;

public class SwapTwoElement {
    public static void swapAndSort(int arr[]){
        int idx1 = -1;
        int idx2 = -1;

        for(int i = 1;i<arr.length;i++){
            if (arr[i]<arr[i-1]) {
                if(idx1==-1){
                    idx1=i-1;
                }else{
                    idx2=i;
                }
            }
        }
        // swap element 
        int temp = arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,4,5,6,3,8};
        swapAndSort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
