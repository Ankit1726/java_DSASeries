package Patterns;

import java.util.Scanner;

public class ButterFly_Pattern {
    public static void butterfly(int row){
        // 1st Half
        for (int i=1;i<=row;i++){
            // star -> i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space -> 2*(n-i)
            for (int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            // star -> i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=row;i>=1;i--){
            // star -> i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space -> 2*(n-i)
            for (int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            // star -> i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your row -> ");
        int row = input.nextInt();
        butterfly(row);
    }
}
