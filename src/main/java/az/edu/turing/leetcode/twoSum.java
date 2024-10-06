package az.edu.turing.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            if (map.containsKey(i1)){
                return new int[]{map.get(i1), i};
            }else {
              map.put(nums[i], i);
            }

        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        ;
    }
}
