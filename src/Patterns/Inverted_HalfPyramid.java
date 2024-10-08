package Patterns;

import java.util.Scanner;

public class Inverted_HalfPyramid {
    public static void pyramid(int rows){
        for (int i=1;i<=rows;i++) {
            // Print Spaces
            for (int j = 1; j <=rows-i; j++) {
                System.out.print(" ");
            } // Print Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your rows -> ");
        int num = input.nextInt();
       pyramid(num);
    }
}
