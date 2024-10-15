package _Stack;

import java.util.Stack;

public class next_Greater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        // Backward loop used -> right greater element find
        for (int i=arr.length-1;i>=0;i--){
            //  1-> while
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){  // idx store
                s.pop();
            }
            // if-else
            if (s.isEmpty()){
                nxtGreater[i] = -1;
            }else {
                nxtGreater[i] = arr[s.peek()];
            }
            // push in s
            s.push(i);
        }
        for (int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
        /*
             Different forms of the question
             next greater right
             next greater left
             next smaller right
             next smaller left

         */
    }
}
