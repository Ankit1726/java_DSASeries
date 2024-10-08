package Patterns;

import java.util.Scanner;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your rows -> ");
        int row = input.nextInt();
        char ch = 'A';
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
