package Arrays;

public class SwapUsingTemp {

    static void swapUsingTempVariable(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }

    static void swapWithoutTempVariable(int a , int b){
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        System.out.println(num1+" "+num2);
        swapWithoutTempVariable(num1, num2);
    }
}