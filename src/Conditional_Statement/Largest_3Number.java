package Conditional_Statement;

import java.util.Scanner;

public class Largest_3Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter three number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>=b && a>=c){
            System.out.println(a+" is the largest number ");
        } else if (b>=c) {
            System.out.println(b+"is the largest number ");
        }else {
            System.out.println(c+" is the largest number ");
        }
    }
}
