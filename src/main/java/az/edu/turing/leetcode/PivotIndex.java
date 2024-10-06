package az.edu.turing.leetcode;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
     int leftSum=0;
     int total=0;
        for (int i = 0; i < nums.length; i++) {
           total=total+nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
         if (leftSum==total-leftSum-nums[i]){
             return i;
         }
         leftSum+=nums[i];
        }
        return -1;
    }
}
