package az.edu.turing.greeksForGreeks;

public class SlidinWindowAlgorithm2 {
    public static int subMaxArray(int[] arr,int k){
        int sum=0;
        int maxSum=0;
        for (int i = 0; i <k; i++) {
         sum+=arr[i];
        }
        maxSum=sum;
        for (int i = k; i <arr.length; i++) {
            sum=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
