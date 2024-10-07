package Functions;

import java.util.Scanner;

public class Binomial_Coefficient {
    public static int factorial(int num){
            int fact = 1;
            for (int i=1;i<=num;i++){
                fact*=i;
            }
            return fact;
        }
        public static int Binomial(int n,int r){
           int n_fact = factorial(n);
           int r_fact = factorial(r);
           int nmr_fact = factorial(n-r);

           // result
           int BinCoeff = n_fact/(r_fact*nmr_fact);
           return BinCoeff;
        }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("pls enter the value of n and r -> ");
        int n = input.nextInt();
        int r = input.nextInt();
        int BinCo = Binomial(n,r);
        System.out.println("Binomial Coefficient is  -> "+BinCo);
    }
}
