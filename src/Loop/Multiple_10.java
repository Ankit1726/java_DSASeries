package Loop;

import java.util.Scanner;

public class Multiple_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("pls enter your number -> ");
            int n = input.nextInt();
            if (n%10 ==0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}
