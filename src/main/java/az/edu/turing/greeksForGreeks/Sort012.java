package az.edu.turing.greeksForGreeks;

public class Sort012 {

    public static void sort012(int[] arr) {
     int low=0; int mid=0; int high=arr.length-1;
     while(mid<high){
         switch (arr[mid]){
             case 0:
                 int temp=arr[low];
                 arr[low]=arr[mid];
                 arr[mid]=temp;
                 mid++; low++;
                 break;
                 case 1:
                     mid++;
                     break;
                      case 2:
                          temp=arr[mid];
                          arr[mid]=arr[high];
                          arr[high]=temp;
                          high--;
                          break;
         }
     }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
