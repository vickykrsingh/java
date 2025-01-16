package Loops;

public class RaiseToThePower {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int pow = 1;
        int i = 1;
        while (i<=b) {
            pow *= a;
            i++;
        }
        System.out.println(pow);
    }
}
