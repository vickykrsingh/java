package Arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        // Array declaration 
        // method 1 
        int[] ages = new int[5]; // store 5 ages of integer types
        String[] names = {"vicky","vikash","vivek","aryaman"};
        Scanner sc = new Scanner(System.in);

        // array input 
        for(int j = 0;j<ages.length;j++){
            System.out.print("Enter "+j+"th Element : ");
            ages[j]=sc.nextInt();
        }

        // Array iteration using 
        // for loop 
        System.out.println("Array iteration using for loop : ");
        for(int i = 0;i<ages.length;i++){
            System.out.println("ages["+i+"] = "+ages[i]);
        }

        // while loop
        System.out.println("Array iteration using while loop : ");
        int i = 0;
        while(i<ages.length){
            System.out.println("ages["+i+"] = "+ages[i]);
            i++;
        }
        // for each loop
        System.out.println("Array iteration using for each loop : ");
        for(String name : names){
            System.out.println(name);
        }
        sc.close();
    }
}
