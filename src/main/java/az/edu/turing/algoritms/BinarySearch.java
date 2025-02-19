package az.edu.turing.algoritms;

public class BinarySearch {

    public int binarySearch(int[] arr, int key) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(bs.binarySearch(arr, 9));
    }
}
