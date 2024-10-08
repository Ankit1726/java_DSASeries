package Patterns;

import java.util.Scanner;

public class Floyd_Triangle {
    public static void Triangle(int row){
        int count = 1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter your rows -> ");
        int row = input.nextInt();
        Triangle(row);

    }
}
