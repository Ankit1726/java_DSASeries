package Recursion;
import java.util.Scanner;

public class print_IncOrder {
    public static void printInc(int n){
        if (n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int n = input.nextInt();
        printInc(n);
    }
}
