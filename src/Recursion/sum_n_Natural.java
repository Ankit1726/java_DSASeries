package Recursion;

import java.util.Scanner;

public class sum_n_Natural {
    public static int Sum_N(int num){
        if (num==1){
            return 1;
        }
       return num+Sum_N(num-1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int n= input.nextInt();
        System.out.println("Sum of n natural number of -> "+n+" -> "+Sum_N(n));

    }
}
