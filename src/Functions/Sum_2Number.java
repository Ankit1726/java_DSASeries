package Functions;

import java.util.Scanner;

public class Sum_2Number {
    public static void Sum(int a,int b){
        int sum = a+b;
        System.out.println("Sum of two number is -> "+sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pla enter your two number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        Sum(a,b);
    }

}
