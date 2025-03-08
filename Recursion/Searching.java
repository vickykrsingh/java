package Recursion;

public class Searching {
    public static boolean isExists(int[] arr,int idx,int x){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==x){
            return true;
        }
        return isExists(arr, idx+1, x);
    }
    public static int findElement(int arr[],int idx,int ele){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==ele){
            return idx;
        }
        return findElement(arr, idx+1, ele);
    }
    public static void findAllOccourences(int arr[],int idx,int ele){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==ele){
            System.out.print(idx+" ");
        }
        findAllOccourences(arr, idx+1, ele);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,2,6,2,3,6,2,10};

        // System.out.println(isExists(arr, 0, 21));
        // System.out.println(findElement(arr, 0, 5));
        // System.out.println(findAllOccourences(arr, 0, 2));
        findAllOccourences(arr, 0, 2);
        System.out.println();

    }
}
