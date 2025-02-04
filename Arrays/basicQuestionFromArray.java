package Arrays;

import java.lang.reflect.Array;

public class basicQuestionFromArray {
    static class CountOccourence{
        int countOcc(int[] arr,int x){
            int count = 0;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]==x){
                    count++;
                }
            }
            return count;
        }

        int lastOccourIndex(int[] arr,int x){
            int lastIndex = -1;
            for(int i = arr.length-1;i!=0;i--){
                if (arr[i]==x) {
                    lastIndex=i;
                    break;
                }
            }
            return lastIndex;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,13,4,2,1,5,2,4,1,4,2,5,3,1};
        CountOccourence c1 = new CountOccourence();
        int res = c1.countOcc(arr, 1);
        System.out.println("No of occourence of 1 is "+res);
        int lastIndex = c1.lastOccourIndex(arr, 3);
        System.out.println("Last Occourence is : "+lastIndex);
        
    }
}
