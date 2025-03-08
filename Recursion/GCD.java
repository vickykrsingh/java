package Recursion;

public class GCD {
    public static void findGCD(int n1,int n2){
        while(n2%n1!=0){
            int temp = n2%n1;
            n2=n1;
            n1=temp;
        }
        System.out.println(n1);
    }
    public static void findGCDUsingRecursion(int n1,int n2){
        if(n2%n1==0){
            System.out.println(n1);
            return;
        }
        findGCDUsingRecursion(n2, n2%n1);
    }
    public static void main(String[] args) {
        // findGCD(8, 20);
        findGCDUsingRecursion(8, 20);

    }
}
