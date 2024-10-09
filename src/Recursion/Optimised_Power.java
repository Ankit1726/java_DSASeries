package Recursion;

import java.util.Scanner;

public class Optimised_Power { // TC-> O(nlog n)
    public static int Power(int a,int n){
        if (n == 0){
            return 1;
        }
        int halfPower = Power(a,n/2);
        int halfPowerSq = halfPower*halfPower;

        // odd case
        if (n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your value of a and n -> ");
        int a = input.nextInt();
        int b =input.nextInt();
        System.out.println(Power(a,b));
    }
}
