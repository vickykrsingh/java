package TargetSum;

public class FindUnique {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,4,2,5,5};
        
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            if (arr[i]>0) {
                System.out.println(arr[i]);
                break;
            }
        }
        
        // for(int ele:arr){
        //     System.out.println(ele);
        // }
    }
}
