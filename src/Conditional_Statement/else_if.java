package Conditional_Statement;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your age -> ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("Adult Person");
        } else if (age>=13 && age<18) {
            System.out.println("Teenagers");
        }else {
            System.out.println("Children");
        }
    }
}
