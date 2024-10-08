package Patterns;

import java.util.Scanner;

public class Inverted_HalfNumberPyramid {
    public static void invertedPyramid(int row){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your rows ->");
        int row = input.nextInt();
        invertedPyramid(row);

    }
}
