package Variables_Datatype;

import java.util.Scanner;

public class Product_2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your two number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int product = a*b;
        System.out.println("Product of two number is -> "+product);

    }
}
