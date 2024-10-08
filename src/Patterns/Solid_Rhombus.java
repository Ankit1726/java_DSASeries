package Patterns;

import java.util.Scanner;

public class Solid_Rhombus {
    public static void printRhombus(int row){
        for (int i=1;i<=row;i++){
            // spaces
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // star
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your row -> ");
        int row = input.nextInt();;
        printRhombus(row);

    }
}
