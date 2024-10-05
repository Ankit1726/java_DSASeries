package Arrays;

public class PrintSubArray {
    public static void printSubArr(int arr[]){
        int tp = 0;
        for (int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end = j;
                for (int k=start;k<=end;k++){   // print
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Pairs -> "+tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};
        printSubArr(arr);
    }
}
