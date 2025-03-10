package Recursion;

public class Subsequence {

    public static String findSubsequence(String s1,String cur){
        if(s1.length()==0){
            System.out.println(cur);
            return cur;
        }
        char ch = s1.charAt(0);
        findSubsequence(s1.substring(1),cur+ch);
        findSubsequence(s1.substring(1), cur+"");
        return s1;
    }

    public static void main(String[] args) {
        findSubsequence("abcd","");
    }
}