package az.edu.turing.greeksForGreeks;

public class MinAndMaxArray {
    public Pair<Long, Long> getMinMax(int[] arr) {
      if (arr == null || arr.length == 0) return null;
      int min = arr[0];
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i]<min) min=arr[i];
          if (arr[i]>max) max=arr[i];
      }
      return new Pair<Long, Long>(min,max);

    }
}
