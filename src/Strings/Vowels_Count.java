package Strings;

import java.util.Scanner;

public class Vowels_Count {
    public static void vowelCount(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Count of Vowels is -> "+count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your String -> ");
        String str = input.nextLine();
        vowelCount(str);
    }
}
