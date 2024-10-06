package Conditional_Statement;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter your Age -> ");
        int age = input.nextInt();
        if (age<18){
            System.out.println("Not Eligible for vote");
        }else {
            System.out.println("Eligible for vote");
        }
    }
}
