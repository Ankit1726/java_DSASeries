package Patterns;

import java.util.Scanner;

public class Hollow_Rhombus {
    public static void hollow_Rhombus(int row){
        for (int i=1;i<=row;i++){
            // spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // hollow-rectangle -> stars
            for (int j=1;j<=row;j++){
                if (i ==1 || i==row || j==1 || j == row){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your row -> ");
        int row = input.nextInt();
        hollow_Rhombus(row);
    }
}
