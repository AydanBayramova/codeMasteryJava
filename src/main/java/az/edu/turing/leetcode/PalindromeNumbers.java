package az.edu.turing.leetcode;

public class PalindromeNumbers {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String strb=new StringBuilder(str).reverse().toString();
        if (str.equals(strb)){
            return true;
        }
        return false;
    }
}
