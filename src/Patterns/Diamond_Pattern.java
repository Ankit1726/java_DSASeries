package Patterns;

import java.util.Scanner;

public class Diamond_Pattern {
    public static void Diamond(int row){
        // 1st half
        for (int i=1;i<=row;i++){
            // spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         // 2nd half
        for (int i=row;i>=1;i--){
            // spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // stars
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your row -> ");
        int row = input.nextInt();
        Diamond(row);

    }
}
