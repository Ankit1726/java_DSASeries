package Arrays;

public class linearSearch {
    public static int  LinearSearch(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,9,10};
        int key = 6;
        System.out.println(LinearSearch(arr,key));

    }
}
