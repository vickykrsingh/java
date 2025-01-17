package NumberSystem;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 23;
        int binary = 0;
        int pow = 1;
        while (decimal>0) {
            binary = binary + (decimal%2*pow);
            decimal = decimal/2;
            pow*=10;
        }
        System.out.println(binary);
    }
}