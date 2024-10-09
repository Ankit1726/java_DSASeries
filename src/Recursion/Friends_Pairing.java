package Recursion;

import java.util.Scanner;

public class Friends_Pairing {
    public static int friend_Pair(int n){
        // Base Case
        if (n==1||n==2){
            return n;
        }
        return friend_Pair(n-1)+(n-1)+friend_Pair(n-2);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your value of n -> ");
        int n = input.nextInt();
        System.out.println("Total number of Ways to Pairing -> "+friend_Pair(n));
    }
}
