package az.edu.turing.algoritms;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
       for (int i = 1; i < arr.length-1; i++) {
           int key = arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>key) {
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=key;
       }
       return arr;
    }
    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {5, 2, 9, 1, 5, 6};

        int[] sortedArr = sorter.insertionSort(arr);


        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
    //cost
    //C(total) = c1(n+1) + n*c2 + n*c3 + n²*c4 + n²*c5 + n²*c6 + n*c7 + c8

    //Pseudocode code part
//    InsertionSort(A);
//    for i=1 to A.length
//    define key=A[i] and j=i-1;
//    write while j>=0 and A[j]>key;
//    A[j+1]=A[j]
//    j=j-1;
//    A[j+1]=key;
//    return A

}
