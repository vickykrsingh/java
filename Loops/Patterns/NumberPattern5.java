package Loops.Patterns;

public class NumberPattern5 {
    public static void main(String[] args) {
        int row = 4;
        int col = 7;

        for(int i =1;i<=row;i++){
            for(int j = 1;j<=col/2-i+1;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i-1;j++){
                System.out.print(j+1);
            }
            for(int j = i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
