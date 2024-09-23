package az.edu.turing.greeksForGreeks;

import java.util.ArrayList;

public class SlidingWindowAlgorithm {
    public static int[] findSubarrayWithSum(int[] arr, int n, int s) {
        int start=0;
        int current_sum=0;
        for (int end = 0; end <n; end++) {
            current_sum+=arr[end];

            while (current_sum>s && start<end){
                current_sum-=arr[start];
                start++;
            }
            if (current_sum==s){
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1};

    }

}
