package Conditions;

import java.util.Scanner;

public class OrOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String res = num % 3 == 0 || num % 5 == 0 ? "test passed" : "test fail";
        System.out.println(res);
        sc.close();
    }
}
