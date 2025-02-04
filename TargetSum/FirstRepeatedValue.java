package TargetSum;

public class FirstRepeatedValue {
    static int repeatedElement(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int lastRepeatedValue(int []arr){
        for(int i = arr.length-1;i>=0;i--){
            for(int j = arr.length-1-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,2,6,3,7};
        int firstRepeatedElement = repeatedElement(arr);
        System.out.println(firstRepeatedElement);
        int lastRepeatedElement = lastRepeatedValue(arr);
        System.out.println(lastRepeatedElement);
    }
}
