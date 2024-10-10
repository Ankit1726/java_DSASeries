package BackTracking;

import java.util.Scanner;

public class find_Permutation {
    public static void findPerm(String str,String ans){
        // Base Case
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // "abcd" -> "ab" + "de"
          String newStr = str.substring(0,i)+str.substring(i+1);
            findPerm(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your String -> ");
        String str = input.nextLine();
        findPerm(str,"");
    }
}
