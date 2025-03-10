package Recursion;

public class PossiableKeyCombination {
    public static void findPossiableKeyCombination(String digit,String[] keys,String res){
        if(digit.length()==0){
            System.out.print(res+" ");
            return;
        }
        int curChar = digit.charAt(0)-'0';
        for(int i = 0;i<keys[curChar].length();i++){
            findPossiableKeyCombination(digit.substring(1), keys, res+keys[curChar].charAt(i));
        }

    }
    public static void main(String[] args) {
        String digit = "23";
        String keys[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        findPossiableKeyCombination(digit, keys, "");
        System.out.println();
    }
}
