package Conditions;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s1 = num % 2 == 0 ? "even" : "odd";
        System.out.println("Number is "+s1);
        sc.close();
    }
}
