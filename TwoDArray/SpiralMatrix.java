package TwoDArray;

public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] spiral, int n) {
        int topRow = 0;
        int rightRow = n - 1;
        int bottmRow = n - 1;
        int leftRow = 0;
        int totalElement = 0;
        while (totalElement < n * n) {
            // top row left -> right
            for (int i = topRow; i <= rightRow; i++) {
                System.out.print(spiral[topRow][i] + " ");
                totalElement++;
            }
            topRow++;
            // right row top -> bottom
            for (int i = topRow; i <= bottmRow; i++) {
                System.out.print(spiral[i][rightRow] + " ");
                totalElement++;
            }
            rightRow--;
            // bottom row right -> left
            for (int i = rightRow; i >= leftRow; i--) {
                System.out.print(spiral[bottmRow][i] + " ");
                totalElement++;
            }
            bottmRow--;
            // left row bottom -> top
            for (int i = bottmRow; i >= topRow; i--) {
                System.out.print(spiral[i][leftRow] + " ");
                totalElement++;
            }
            leftRow++;
        }
    }

    public static void main(String[] args) {
        int spiralMatrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printSpiralMatrix(spiralMatrix, 4);
        System.out.println();
    }
}
