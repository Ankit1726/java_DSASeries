package Functions;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class check_Prime {
    // Most Important
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }
}
