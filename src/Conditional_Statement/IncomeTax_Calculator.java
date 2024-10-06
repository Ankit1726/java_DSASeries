package Conditional_Statement;

import java.util.Scanner;

public class IncomeTax_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your income -> ");
        int income = input.nextInt();
        int tax;
        if (income<500000){
            tax = 0;
        } else if (income>=500000 && income<1000000) {
            tax = (int)(income*0.2);
        }else {
            tax = (int)(income*0.3);
        }
        System.out.println("Your Tax is ->  "+tax);
    }
}
