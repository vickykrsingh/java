package TwoDArray;

public class SpiralMatrixFormation {
    public static int[][] spiralFormation(int n){
        int arr[][] = new int[n][n];
        int totalElement=0;
        int topRow = 0;
        int rightCol = n-1;
        int bottomRow = n-1;
        int leftCol = 0;
        int curEle=1;
        while (totalElement<n*n) {
            // top row
            for(int i = topRow;i<=rightCol && totalElement<n*n;i++){
                arr[topRow][i]=curEle++;
                totalElement++;
            }
            topRow++;
            // right col
            for(int i = topRow;i<=bottomRow && totalElement<n*n;i++){
                arr[i][rightCol]=curEle++;
                totalElement++;
            }
            rightCol--;
            // bottom row
            for(int i = rightCol;i>=leftCol && totalElement<n*n;i--){
                arr[bottomRow][i] = curEle++;
                totalElement++;
            }
            bottomRow--;
            // left col
            for(int i = bottomRow;i>=topRow && totalElement<n*n;i--){
                arr[i][leftCol]=curEle++;
                totalElement++;
            }
            leftCol++;
        }
        return arr;
    }
    public static void printArr(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int res[][] = spiralFormation(4);
        printArr(res);
        
    }
}
