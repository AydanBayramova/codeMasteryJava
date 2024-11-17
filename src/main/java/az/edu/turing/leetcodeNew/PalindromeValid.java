package az.edu.turing.leetcodeNew;

public class PalindromeValid {

    //Character.isLetterOrDigit metodu məhz hərf (letters)
    // və rəqəmləri (digits) yoxlayır və boşluqları (space), durğu işarələrini
    // və digər xüsusi simvolları nəzərə almır.
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        int left=0;
        int right=lowerCase.length()-1;
        while (left < right) {
            if (!Character.isLetterOrDigit(lowerCase.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(lowerCase.charAt(right))) {
                right--;
            } else {
                if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeValid p = new PalindromeValid();
        System.out.println(p.isPalindrome("aba"));
    }
}
