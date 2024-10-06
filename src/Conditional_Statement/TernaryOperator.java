package Conditional_Statement;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter you number -> ");
        int num = input.nextInt();
        String ans = (num%2==0) ? (num+" is even number ") : (num+" is odd number ");
        System.out.println(ans);
    }
}
