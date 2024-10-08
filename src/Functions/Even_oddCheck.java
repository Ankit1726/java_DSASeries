package Functions;

import java.util.Scanner;

public class Even_oddCheck {
    public static boolean isEven(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your number -> ");
        int num = input.nextInt();
        if (isEven(num)){
            System.out.println("Number is Even ");
        }else {
            System.out.println("Number is Odd ");
        }
    }
}
