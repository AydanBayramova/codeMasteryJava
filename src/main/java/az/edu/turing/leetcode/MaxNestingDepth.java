package az.edu.turing.leetcode;

public class MaxNestingDepth {
    public int maxDepth(String s) {
         int maxDepth = 0;
         int currentDepth = 0;
         for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             if (ch=='('){
                 currentDepth++;
                 maxDepth = Math.max(currentDepth, maxDepth);
             }
             else if (ch==')'){
                 currentDepth--;
                 maxDepth = Math.max(currentDepth, maxDepth);

             }
         }
         return maxDepth;
    }
    public static void main(String[] args) {
        MaxNestingDepth solution = new MaxNestingDepth();
        String s1 = "(1+(2*3)+((8)/4))+1";
        String s2 = "(1)+((2))+(((3)))";
        String s3 = "()(())((()()))";

        System.out.println(solution.maxDepth(s1));
        System.out.println(solution.maxDepth(s2));
        System.out.println(solution.maxDepth(s3));
    }
}
