package BackTracking;

import java.util.Scanner;

public class find_Subsets {  // TC->O(n*2^n)
    public static void findSubset(String str,String ans,int i){
        // base case
        if (i==str.length()){
            System.out.println(ans);
            return;
        }
        // yes choice
        findSubset(str,ans+str.charAt(i),i+1);
        // no choice
        findSubset(str,ans,i+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your string -> ");
        String str = input.nextLine();
        findSubset(str,"",0);
    }
}
