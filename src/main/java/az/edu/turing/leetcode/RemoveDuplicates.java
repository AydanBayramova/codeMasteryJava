package az.edu.turing.leetcode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
             nums[++k] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveDuplicates r = new RemoveDuplicates();
        System.out.println(r.removeDuplicates(new int[]{1,1,2}));
    }
}
