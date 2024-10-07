package Loop;

import java.util.Scanner;

public class PrimeNumber_Not {
    public static void main(String[] args) {
        // Most Important Number
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int n = input.nextInt();
         boolean isPrime = true;
         for (int i=2;i<Math.sqrt(n);i++){
             if (n%i==0){
                 isPrime = false;
             }
         }
         if (isPrime == true){
             System.out.println("Number is Prime ");
         }else{
             System.out.println("Number is not Prime ");
         }
    }
}
