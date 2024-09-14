package az.edu.turing.greeksForGreeks;

public class PeakNumber {

    public int peakNum(int[] arr, int n) {
        if (n == 1) return 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) return i;
            else if (i == n - 1 && arr[i] > arr[i - 1]) return i;
            else if (arr[i] >= arr[i + 1] && arr[i] >= arr[i - 1]) return i;
        }
        return -1;
    }
}
