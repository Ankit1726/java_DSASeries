package Arrays;

public class BinarySearch {
    public static int binary(int arr[],int key){
        int start = 0, end = arr.length;
        while (start<=end){
            int mid = (start+end)/2;

            // compare
            if (arr[mid]== key){
                return mid;
            }
            if (arr[mid]<key){
                // right
                start = mid+1;
            }else {
                // left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,7,2,3,8};
        int key = 5;

        System.out.println("Index of key is at index -> "+binary(arr,key));


    }
}
