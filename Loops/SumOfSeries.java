package Loops;

public class SumOfSeries {
    public static void main(String[] args) {
        int num = 5;
        int ans = 0;

        for(int i =0;i<=num;i++){
            if(i%2==0){
                ans=ans-i;
            }else{
                ans=ans+i;
            }
        };
        System.out.println(ans);
    }
}
