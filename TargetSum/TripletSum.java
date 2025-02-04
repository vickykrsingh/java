package TargetSum;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,4,9,7,8,6};
        int tripletSumCount = 0;
        int target = 10;

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        tripletSumCount++;
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }

        System.out.println("Found Triplet sum count "+tripletSumCount);
    }
}
