package Recursion;

public class last_Occur {
    public static int last_Occ(int arr[],int key,int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = last_Occ(arr,key,i+1);
        if (isFound==-1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,4,6,8,6,9,1,5};
        System.out.println(last_Occ(arr,9,0));
    }
}
