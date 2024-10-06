package az.edu.turing.leetcode;

import java.util.HashSet;

public class IntersectionTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet=new HashSet<>();
        HashSet<Integer> addTotal=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hashSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashSet.contains(nums2[i])){
               addTotal.add(nums2[i]);
            }
        }
        int[] arr = new int[addTotal.size()];
        int index = 0;
        for (int num : addTotal) {
            arr[index++] = num;
        }

        return arr;
    }
}
