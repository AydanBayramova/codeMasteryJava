package az.edu.turing.dataStructures;

import java.util.Arrays;

public class TargetTwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 19;
        System.out.println();
        twoSum(arr, target);
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
