package az.edu.turing.algoritms;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> map = new HashMap<>();
     for (int i = 0; i < nums.length; i++) {
         if (map.containsKey(target - nums[i])) {
             return new int[]{map.get(target - nums[i]), i};
         }else {
             map.put(nums[i], i);
         }
     }
     return new int[0];
    }
}
//Cost analysis
//total=c1+c2⋅(n+1)+c3⋅n+c4+c5⋅n+c6
//Time and space complexity is O(n)