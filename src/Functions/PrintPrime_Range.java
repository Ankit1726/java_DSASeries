package Functions;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class PrintPrime_Range {
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printRange(int num){
        for (int i=2;i<=num;i++){
            if (isPrime(i)){
                // True then Print
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int num = input.nextInt();
        printRange(num);
    }
}
