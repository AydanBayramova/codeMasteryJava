package az.edu.turing.leetcode;

public class ConvertArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if (original.length != m * n) {
            return new int[0][0];
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ConvertArray ca = new ConvertArray();
        int[] original = {1, 2, 3, 4};
        int[][] result = ca.construct2DArray(original, 2, 2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
