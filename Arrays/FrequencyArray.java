package Arrays;

import java.util.Scanner;

public class FrequencyArray {
    static void checkElementPresentOrNot(int arr[],int q){
        int frequencyLength = arr.length+5;
        int frequencyArray[] = new int[frequencyLength];
        for(int i = 0;i<arr.length;i++){
            frequencyArray[arr[i]]++;
        }
        
        while(q>=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Element to Search : ");
            int num = sc.nextInt();
            if (frequencyArray[num]>0) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,5,3,5,2,3,5,3,2,4,2,5,6,3,4,2};
        checkElementPresentOrNot(arr, 5);

    }
}
