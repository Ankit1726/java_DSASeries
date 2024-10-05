package Sorting_Algorithm;

public class Insertion_Sort {
    public static void insertion(int arr[]){
        for (int i=1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            // find correct pos to insert
            while (prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = arr[curr];
        }
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,5,2,7,5,8,6};
        insertion(arr);
        printArr(arr);
    }
}
