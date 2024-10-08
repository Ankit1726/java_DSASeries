package Strings;

import java.util.Scanner;

public class SubString {
    public static String subString(String str,int si,int ei){
        String SubStr = "";
        for (int i=si;i<ei;i++){
            SubStr+=str.charAt(i);
        }
        return SubStr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your String -> ");
        String str = input.nextLine();
        System.out.println("pls enter your si and ei ->");
        int si = input.nextInt();
        int ei = input.nextInt();
        System.out.println("Substring is -> "+subString(str,si,ei));

    }
}
