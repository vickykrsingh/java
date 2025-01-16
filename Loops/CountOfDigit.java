package Loops;

public class CountOfDigit {
    public static void main(String[] args) {
        int num = 12424;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
