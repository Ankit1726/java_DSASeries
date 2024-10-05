package Arrays;

public class LargestNumber_Search {
    public static int largestSearch(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,3,7,9};
        System.out.println( largestSearch(arr));
    }
}
