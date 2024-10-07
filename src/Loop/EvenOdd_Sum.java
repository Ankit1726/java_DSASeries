package Loop;

import java.util.Scanner;

public class EvenOdd_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("pls enter your number -> ");
            int n = input.nextInt();
            if(n%2==0){
                evenSum+=n;
            }else {
                oddSum+=n;
            }
            System.out.println("Do you want continue Press 1 ? ");
            choice = input.nextInt();
        }while (choice==1);

        System.out.println("Sum of Even Number -> "+evenSum);
        System.out.println("Sum of Odd Number -> "+oddSum);
    }
}
