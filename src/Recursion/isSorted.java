package Recursion;

public class isSorted {
    public static boolean is_Sort(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return is_Sort(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(is_Sort(arr,0));
    }
}
