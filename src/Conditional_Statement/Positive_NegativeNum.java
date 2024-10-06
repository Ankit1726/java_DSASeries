package Conditional_Statement;

import java.util.Scanner;

public class Positive_NegativeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number ->");
        int num = input.nextInt();
        if (num<0){
            System.out.println(num+" is negative number ");
        }else {
            System.out.println(num+ "is the positive number");
        }
    }
}
