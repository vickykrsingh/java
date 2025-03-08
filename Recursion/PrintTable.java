package Recursion;

public class PrintTable {

    public static void table(int n,int k){
        if(k<=1){
            System.out.print(n*k+" ");
            return;
        }
        table(n, k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        table(3, 5);
        System.out.println();
    }
}
