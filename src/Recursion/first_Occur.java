package Recursion;

public class first_Occur {
    public static int first_Occ(int arr[],int i,int key){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return first_Occ(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,6,9,9,3};
        System.out.println(first_Occ(arr,0,9));
    }
}
