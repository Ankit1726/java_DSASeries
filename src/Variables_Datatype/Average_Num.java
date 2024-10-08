package Variables_Datatype;

import java.util.Scanner;

public class Average_Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your 3 number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average of three number is -> "+avg);

    }
}
