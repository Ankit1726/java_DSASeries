package Recursion;

import java.util.Scanner;

public class Fibonacci_num {
    public static int Fib(int n){
        // Base Case
        if (n==0 || n==1){
            return n;
        }
        int Fnm1 = Fib(n-1);
        int Fnm2 = Fib(n-2);
        return Fnm1+Fnm2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLs enter your number -> ");
        int n = input.nextInt();
        System.out.println("Fibonacci Series of "+n+" -> "+Fib(n));
    }
}
