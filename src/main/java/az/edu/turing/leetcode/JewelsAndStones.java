package az.edu.turing.leetcode;

import java.util.HashSet;
import java.util.stream.IntStream;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> hashSet=new HashSet<>();
        int jewelNum=0;
        for (int i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))){
                jewelNum=jewelNum+1;
            }
        }
        return jewelNum;

    }
}
