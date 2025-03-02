package TwoDArray;

public class PascalTriangle {
    public static void print2DArray(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] pascalTriangle() {
        int row = 5;
        int[][] arr = new int[5][];
        for(int i = 0;i<row;i++){
            arr[i] = new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j = 1;j<i;j++){
                arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][] = pascalTriangle();
        print2DArray(arr);
    }
}
