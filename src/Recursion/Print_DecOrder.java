package Recursion;
import java.util.Scanner;

public class Print_DecOrder {
    public static void printDec(int n){
        // Base Case
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int n = input.nextInt();
       printDec(n);
    }
}
