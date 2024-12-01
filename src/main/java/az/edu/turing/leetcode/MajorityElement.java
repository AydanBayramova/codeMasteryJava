package az.edu.turing.leetcode;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            if (map.get(nums[i]) > count) {
                return nums[i];
            }
        }

        return 0;

    }
}
