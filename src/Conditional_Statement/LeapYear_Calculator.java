package Conditional_Statement;

import java.util.Scanner;

public class LeapYear_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter year 4-number -> ");
        int year = input.nextInt();

        if ((year%4==0 || year%400==0) && (year%100!=0)){
            System.out.println(year + " is Leap Year");
        }else {
            System.out.println(year+" is not Leap year");
        }
    }
}
