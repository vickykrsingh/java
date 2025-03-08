package Recursion;

public class StringManupulation {
    public static String removeChar(String s1,int idx,char ch){
        if (s1.length()==0) {
            return "";
        }
        String smallAns = removeChar(s1.substring(1), idx, ch);
        if(s1.charAt(0)!=ch){
            return s1.charAt(0)+smallAns;
        }else{
            return smallAns;
        }
    }
    public static String reverseString(String s1,int idx){
        if(idx==s1.length()){
            return "";
        }
        return reverseString(s1, idx+1)+s1.charAt(idx);
    }
    public static String palindrome(String s1,int idx){
        if (idx==s1.length()) {
            return "";
        }
        return palindrome(s1, idx+1)+s1.charAt(idx);
    }
    public static boolean palindromeNew(String s1,int sp,int ep){
        if(sp>=ep){
            return true;
        }
        if(s1.charAt(sp)!=s1.charAt(ep)){
            return false;
        }
        return palindromeNew(s1, sp+1,ep-1);
    }
    public static void main(String[] args) {
        String s1 = "haah";
        // System.out.println(removeChar(s1, 0, 'h'));
        // System.out.println(palindrome(s1, 0).equals(s1) ? "yes" : "no");
        System.out.println(palindromeNew(s1, 0, s1.length()-1));
    }
}
