package Loop;

import java.util.Scanner;

public class Print_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int num = input.nextInt();
        while (num>0){
            int lastDigit = num % 10;   // To get -> LastDigit
            System.out.print(lastDigit+" ");
            num = num/10;   // To remove -> lastDigit
        }
        System.out.println();
    }
}
