package Conditions;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        if(age<12){
            System.out.println("Child");
        }else if(age>=12 && age<18){
            System.out.println("Teen ager");
        }else{
            System.out.println("Adult");
        }
    }
}
