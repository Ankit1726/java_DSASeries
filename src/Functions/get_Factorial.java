package Functions;

import java.util.Scanner;

public class get_Factorial {
    public static int factorial(int num){
        int fact = 1;
       for (int i=1;i<=num;i++){
           fact*=i;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of "+num+" -> "+fact);
    }
}
