package Loops.Patterns;

public class NumberPattern {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        for(int i =1;i<=row;i++){
            for(int j = i;j<col;j++){
                System.out.print(j);
            }
            for(int j = 1;j<i-1+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
