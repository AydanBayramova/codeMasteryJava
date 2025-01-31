package az.edu.turing.dataStructures;

public class PalindromeString {
    public static void main(String[] args) {
        String s1 = "java";
        System.out.println(isPalindrome(s1));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
