package az.edu.turing.leetcode;

public class FindReplaceNumber {
    public int chalkReplacer(int[] chalk, int k) {
        long total=0;

        for (int i = 0; i < chalk.length; i++) {
            total+=chalk[i];
        }
        k=(int)(k%total);

        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i]>k){
                return i;
            }
            k-=chalk[i];
        }
        return -1;
    }
}
