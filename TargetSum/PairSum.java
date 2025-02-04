package TargetSum;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,7,11,12};
        int target = 5;
        int foundTargetSumPairCount = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    foundTargetSumPairCount++;
                }
            }
        }

        System.out.println("Found Target Sum Pair count "+foundTargetSumPairCount);
    }
}
