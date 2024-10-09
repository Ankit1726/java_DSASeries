package Recursion;

import java.util.Scanner;

public class Binary_StringProblem {
    public static void printBinString(int n,int lastPLace,String str){
        // Base Case
        if (n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0,str+"0");
        if (lastPLace == 0){
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your value of n -> ");
        int n = input.nextInt();
        printBinString(n,0,"");
    }
}
