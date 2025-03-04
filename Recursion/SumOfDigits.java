package Recursion;

public class SumOfDigits {

    static int findSumOfDigit(int n){
        if (n/10<=0) {
            return n;
        }
        return n%10+findSumOfDigit(n/10);
    }

    static int findToThePower(int p,int q){
        if (q<=2) {
            return p*p;
        }
        return p*findToThePower(p, q-1);
    }

    public static void main(String[] args) {
        System.out.println(findSumOfDigit(1243));
        // System.out.println(findToThePower(2, 4));
    }
}
