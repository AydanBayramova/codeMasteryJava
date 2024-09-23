package az.edu.turing.leetcode;

public class PalindromeNumbers {
    public static boolean isPalindrome(int x) {
//        String str = String.valueOf(x);
//        String strb=new StringBuilder(str).reverse().toString();
//        if (str.equals(strb)){
//            return true;
//        }
//        return false;

        if (x < 0) return false;
        int rev = 0;
        int number = x;
        while (x!= 0){
            rev = rev*10 + x%10;
            x = x/10;

        }
        if (rev == number) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
