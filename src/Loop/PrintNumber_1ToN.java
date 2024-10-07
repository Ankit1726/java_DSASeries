package Loop;

import java.util.Scanner;

public class PrintNumber_1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your range -> ");
        int num = input.nextInt();
        int count = 1;
        while (count<=num){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}
