package Strings;

import java.util.Scanner;

public class stringClass {
    public static void printLetters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Strings -> Immutable
        Scanner input = new Scanner(System.in);
        String str = new String();
        System.out.print("Pls enter your String -> ");
        String name = input.nextLine();
        System.out.println("Welcome -> "+name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));


    }
}
