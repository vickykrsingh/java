package Recursion;

public class AlternateSignSum {
    public static int alternateSignSumMethod(int n){
        if (n==0) {
            return 0;
        }
        if(n%2==0)
        return alternateSignSumMethod(n-1)-n;
        else
        return alternateSignSumMethod(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(alternateSignSumMethod(10));
    }
}
