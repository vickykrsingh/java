package Loops.Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int row = 50;
        for(int i =0;i<=row;i++){
            for(int j = 0;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
