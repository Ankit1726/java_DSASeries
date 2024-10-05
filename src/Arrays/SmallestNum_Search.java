package Arrays;

public class SmallestNum_Search {
    public static int smallestSearch(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,5,2,1};
        System.out.println(smallestSearch(arr));
    }
}
