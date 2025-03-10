package Recursion;

public class FrogJump {
    public static int findMinimumCost(int[] h,int idx,int n){
        if (idx==n-1) {
            return 0;
        }
        int option1 = Math.abs(h[idx]-h[idx+1])+findMinimumCost(h, idx+1, n);
        if(idx==n-2) return option1;
        int option2 = Math.abs(h[idx]-h[idx+2])+findMinimumCost(h, idx+2, n);
        return Math.min(option1, option2);
    }

    public static void main(String[] args) {
        int height[] = {10,30,40,20,40,10,30,10,80,70};
        System.out.println(findMinimumCost(height, 0,height.length));
    }
}