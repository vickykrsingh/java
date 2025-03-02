package Recursion;

public class Factorial {
    static int fact = 1;
    public static void factorial(int n){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact*=n;
        factorial(n-1);
    }
    public static void main(String[] args) {
        factorial(1);
    }
}
