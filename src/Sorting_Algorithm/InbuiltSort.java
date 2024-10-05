package Sorting_Algorithm;
import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = {4,6,2,3,4,5,1};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
