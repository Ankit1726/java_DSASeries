package Loop;

import java.util.Scanner;

public class Reverse_GivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int num = input.nextInt();
        int rev = 0;
        while (num>0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num/=10;
        }
        System.out.println(" Reverse of the given number is -> "+rev);
    }
}
