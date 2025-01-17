package NumberSystem;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 10111;
        int decimal = 0;
        int pow = 1;
        while (binary>0) {
            decimal = decimal + (binary%2)*pow;
            binary = binary/10;
            pow*=2;
        }
        System.out.println(decimal);
    }
}
