package Conditional_Statement;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter two number ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("pls enter your operator ");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '^':
                System.out.println(a^b);
                break;
        }
    }
}
