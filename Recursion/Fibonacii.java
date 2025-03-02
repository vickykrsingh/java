package Recursion;

public class Fibonacii {
    static int sum = 1;
    static int prev = 0;
    static int next = 1;
    public static void printFiboSeries(int n){
        if(n<=1){
            System.out.print(0+"+");
            return;
        }
        printFiboSeries(n-1);
        System.out.print(next);
        if (n==15) {
            System.out.print("");
        }else{
            System.out.print("+");
        }
        int temp = prev;
        prev = next;
        next = temp+next;
        sum = prev+next;
    }
    public static void main(String[] args) {
        printFiboSeries(15);
        System.out.print("="+sum);
        System.out.println();
    }
}
