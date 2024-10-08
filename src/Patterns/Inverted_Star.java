package Patterns;

import java.util.Scanner;

public class Inverted_Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your rows -> ");
        int row = input.nextInt();
        for (int i=1;i<=row;i++){
            // inverted -> (n-i+1)
            for (int s=1;s<=(row-i+1);s++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
