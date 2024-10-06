package Conditional_Statement;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println(num+" is even number ");
        }else {
            System.out.println(num+" is odd number ");
        }
    }
}
