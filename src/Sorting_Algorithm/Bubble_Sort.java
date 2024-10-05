package Sorting_Algorithm;

public class Bubble_Sort {
    public static void Bubble(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,5,3,6,8,9,1};
        Bubble(arr);
        printArr(arr);
    }
}
