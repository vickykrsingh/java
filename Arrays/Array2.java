package Arrays;

import java.util.Scanner;

public class Array2 {
    static class ArrayIteration {
        int size = 5;
        int arr[] = new int[size];
        int twoDArray[][] = new int[3][3];

        public void runTask() {
            Scanner sc1 = new Scanner(System.in);
            while (true) {
                System.out.println("Enter Choice : ");
                int choice = sc1.nextInt();
                switch (choice) {
                    case 1:
                        input2DArrayElement();
                        System.out.println("Done");
                        break;
                    case 2:
                        inputArrayElement();
                        System.out.println("Done");
                        break;
                    case 3:
                        get2DArrayElement();
                        System.out.println("Done");
                        break;
                    case 4:
                        getArrayElement();
                        System.out.println("Done");
                        break;
                    case 0:
                        System.out.println("Exit Successfully");
                        return;
                    default:
                        System.out.println("Please Enter valid choice \nPress 1 for taking input of 2D array \nPress 2 for taking input of 1D array \nPress 3 for Printing 2D Array \nPress 4 for Printing 1D Array : ");
                }
            }
        }

        public void inputArrayElement() {
            Scanner sc2 = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter array element : arr[" + i + "] : ");
                arr[i] = sc2.nextInt();
            }
        }

        public void getArrayElement() {
            int i = 0;
            while (i < arr.length) {
                System.out.println("arr[" + i + "] = " + arr[i]);
                i++;
            }
        }

        public void input2DArrayElement() {
            Scanner sc3 = new Scanner(System.in);
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.print("Enter twoDArray[" + i + "][" + j + "] = ");
                    twoDArray[i][j] = sc3.nextInt();
                }
            }
        }

        public void get2DArrayElement() {
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.println("twoDArray[" + i + "][" + j + "] : " + twoDArray[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayIteration a1 = new ArrayIteration();
        a1.runTask();
    }
}
