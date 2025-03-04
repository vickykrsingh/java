package Recursion;

public class Fibonacii {
    public static void printFiboSeries(int n,int prev,int next){
        if(n<=1){
            return;
        }
        System.out.print(next+" ");
        printFiboSeries(n-1, next, prev+next);
    }
    public static void main(String[] args) {
        printFiboSeries(15,0,1);
        System.out.println();
    }
}
