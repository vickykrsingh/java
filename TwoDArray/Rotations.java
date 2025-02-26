package TwoDArray;

public class Rotations {

    public static void printArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void transposedMatrix(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void rotateMatrix(int[][] arr){
        transposedMatrix(arr);
        for(int i = 0;i<arr.length;i++){
            reverseArray(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        printArray(matrix);
        rotateMatrix(matrix);
        printArray(matrix);
    }
}
