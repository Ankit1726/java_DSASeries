package Functions;

import java.util.Scanner;

public class sum_nDigit {
    public static int N_Sum(int num){
        int sum = 0;
        while (num>0){
            int lastDigit = num%10;
            sum=sum+lastDigit;
            num/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number  -> ");
        int num = input.nextInt();
        System.out.println( "Total Sum of N digit is -> "+N_Sum(num));
    }
}
