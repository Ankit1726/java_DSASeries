package Patterns;

import java.util.Scanner;

public class _0_1_Triangle {
    public static void Triangle(int row){
        for (int i=1;i<=row;i++){
           for (int j=1;j<=i;j++){
               // Even
               if ((i+j)%2==0){
                   System.out.print("1"+" ");
               }else {
                   System.out.print("0"+" ");
               }
           }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your row -> ");
        int row = input.nextInt();
        Triangle(row);

    }
}
