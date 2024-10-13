package az.edu.turing.leetcode;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
