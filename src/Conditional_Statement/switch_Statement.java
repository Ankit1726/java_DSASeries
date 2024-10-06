package Conditional_Statement;

import java.util.Scanner;

public class switch_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your number ->  ");
        int num = input.nextInt();

        switch (num){
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Dosa");
                break;
            case 3:
                System.out.println("Chaat");
                break;
            case 4:
                System.out.println("Idli");
                break;
            case 5:
                System.out.println("Tikki");
                break;
            default:
                System.out.println("Sorry currently not available ");
        }
    }
}
