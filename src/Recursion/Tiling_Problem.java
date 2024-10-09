package Recursion;

import java.util.Scanner;

public class Tiling_Problem {
    public static int Tiles_Problem(int n){  // 2 * n floor
        // Base Case
        if (n==0 || n==1){
            return 1;
        }
        // Vertical Choice
        int Fnm1 = Tiles_Problem(n-1);

        // Horizontal Choice
        int Fnm2 = Tiles_Problem(n-2);

        int TotalWays = Fnm1+Fnm2;
        return TotalWays;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your value of n -> ");
        int n = input.nextInt();
        System.out.println("Total Number of Ways to Arrange Tiles in Floor -> "+Tiles_Problem(n));
    }
}
