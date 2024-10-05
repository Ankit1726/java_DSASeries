package Arrays;

public class maxArraySum {   //TC-> O(n^3)
    // Brute Force Approach
    public static int subArrSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end = j;
                currSum = 0;
                for (int k=start;k<=end;k++){  // print
                    // SubArray Sum
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if (maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,6,2,4};
        System.out.println("Max Sum -> "+subArrSum(arr));
    }
}
