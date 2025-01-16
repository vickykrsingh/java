package Loops;

import java.util.Scanner;

// class LoopsBasic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         int i = 0;
//         while(i<=num){
//             sum += i;
//             i++;
//         }
//         System.out.println(sum);
//         sc.close();

//     }
// }

// public class LoopsBasic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         for(int i = 0;i<=num;i++){
//             sum += i;
//         }
//         System.out.println(sum);
//         sc.close();
//     }
// }



public class LoopsBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 0;
    
        do{
            sum += i;
            i++;
        }while(i<=num);

        System.out.println(sum);
        sc.close();
    }
}