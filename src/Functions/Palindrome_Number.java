package Functions;

import java.util.Scanner;

public class Palindrome_Number {
    public static boolean isPalindrome(int num){
        if (num<0){
            return false;
        }
        int OriginalNum = num;
        int rev = 0;
        while (num>0){
            int lastDigit = num%10;
            rev = rev = rev*10+lastDigit;
            num/=10;
        }
        return OriginalNum==rev;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int num = input.nextInt();
       if (isPalindrome(num)){
           System.out.println("Palindrome number ");
       }else {
           System.out.println("Not Palindrome number ");
       }
    }
}
