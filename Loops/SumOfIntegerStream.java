package Loops;

import java.util.Scanner;

public class SumOfIntegerStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true) {
            num = sc.nextInt();
            if(num==-1){
                break;
            }
            sum +=num;
        }
        System.out.println("Sum is : "+sum);
        sc.close();
    }
}
