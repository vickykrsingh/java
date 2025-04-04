package Searching;

public class FindSquareRoot {
    static int findSquareRoot(int num){
        int start = 0;
        int end = num;
        int sqRoot = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid>num){
                end=mid-1;
            }else if(mid*mid<num){
                start=mid+1;
                sqRoot=mid;
            }else if(mid*mid==num){
                return mid;
            }
        }
        return sqRoot;
    }
    public static void main(String[] args) {
        int num = 100;
        System.out.println(findSquareRoot(num));
    }
}
