package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_String {
    public static void checkAnagram(String str1 ,String str2){
        // Convert to lower Case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check the length
        if (str1.length() == str2.length()){
            char[] str1charArr = str1.toCharArray();
            char[] str2charArr = str1.toCharArray();
            // Sort element
            Arrays.sort(str1charArr);
            Arrays.sort(str2charArr);

            boolean result = Arrays.equals(str1charArr,str2charArr);
            if (result == true){
                System.out.println(str1 + " and "+str2+" are anagrams of each other");
            }else {
                System.out.println(str1+" and "+str2+" are not anagram of each other");
            }
            // String length are not equal
            }else {
            System.out.println(str1+" and "+str2+" are not anagram of each other");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two strings -> ");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        checkAnagram(str1,str2);
    }
}
