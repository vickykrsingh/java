package TwoDArray;

public class Transpose {

    static void transposeOfSquareMatrix(int[][] matrix){
        int j=0;
        int i = 0;
        while(i<matrix.length){
            while(j<matrix.length){
                if(i==j){
                    j++;
                }else{

                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                    j++;
                }
            }
            i++;
            j=i;
        }
    }

    static void inplaceTranspose(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;            }
        }
    }

    static int[][] transposeOfMatrix(int[][] matrix){
        int transposedMatrix[][] = new int[matrix[0].length][matrix.length];

        for(int i = 0;i<transposedMatrix.length;i++){
            for(int j = 0;j<transposedMatrix[i].length;j++){
                transposedMatrix[i][j]=matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    static void printTwoDArray(int arr[][]){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printTwoDArray(arr);
        System.out.println();
        inplaceTranspose(arr);
        printTwoDArray(arr);
        System.out.println();
        // int res[][] = transposeOfMatrix(arr);
        // printTwoDArray(res);
        // System.out.println();
    

    }
}