package Patterns;

import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number of rows -> ");
        int row = input.nextInt();
        for (int i=1;i<=row;i++){
            for (int s=1;s<=i;s++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
