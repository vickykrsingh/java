package Loops;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 3245;
        int reversedNum = 0;
        while (num!=0) {
            reversedNum = (num%10)+reversedNum*10;
            num = num/10;
        }
        System.out.println(reversedNum);
    }
}
