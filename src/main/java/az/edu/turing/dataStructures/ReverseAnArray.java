package az.edu.turing.dataStructures;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverseAnArray(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverseAnArray(int[] arr) {
        int left = 0;
        int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
