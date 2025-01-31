package az.edu.turing.dataStructures;

public class MaxNumberofArray {
    public static void main(String[] args) {
    }

    public int maxNumberofArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }
}
