package Loop;

import java.util.Scanner;

public class Print_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your number -> ");
        int num = input.nextInt();
        // Initialization
        int i = 0;
        while (i<=10){  // loop
            System.out.println(num+" X "+i+" = "+(num*i));
            i++;     // increment/decrement
        }
    }
}
