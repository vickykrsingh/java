package Sorting;

public class MergeSort {

    static void merge(int arr[],int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i = 0;i<n1;i++){
            leftArr[i] = arr[l+i];
        }

        for(int j = 0;j<n2;j++){
            rightArr[j] = arr[mid+1+j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<n1){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        
    }

    static void mergeSort(int[] arr,int l,int r){
        if (l>=r) {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int arr[] = {9,5,1,2,7,3,4,6};
        mergeSort(arr, 0, arr.length-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
