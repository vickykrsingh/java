package Loops.Patterns;

public class Rectangle {
    public static void main(String[] args) {
        int row = 4;
        int col = 7;

        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
