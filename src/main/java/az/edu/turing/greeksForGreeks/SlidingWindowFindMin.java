package az.edu.turing.greeksForGreeks;

public class SlidingWindowFindMin {
    public static int findMin(int arr[], int k){
        int minSum=0;
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        minSum=sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            minSum=Math.min(sum,minSum);
        }
        return minSum;
    }
}
