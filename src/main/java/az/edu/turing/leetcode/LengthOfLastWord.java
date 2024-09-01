package az.edu.turing.leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] tokens = s.split(" ");
        String token = tokens[tokens.length - 1];
        return token.length();
    }
}
