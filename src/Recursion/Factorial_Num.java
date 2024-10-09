package Recursion;

import java.util.Scanner;

public class Factorial_Num {
    public static int factorial(int num){
        if (num == 0){
            return 1;
        }
        int fn = num*factorial(num-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your number -> ");
        int num = input.nextInt();
        System.out.println("Factorial of "+num+" -> "+ factorial(num));
    }
}
