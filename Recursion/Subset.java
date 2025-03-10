package Recursion;

public class Subset {
    public static String findSubset(String s1,String cur){
        if(s1.length()==0){
            System.out.println(cur);
            return cur;
        }
        char ch = s1.charAt(0);
        findSubset(s1.substring(1), cur+ch);
        findSubset(s1.substring(1), cur);
        return s1;
    }
    public static void main(String[] args) {
        findSubset("2463", "");
    }
}
