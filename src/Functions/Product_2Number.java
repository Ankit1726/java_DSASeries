package Functions;

import java.util.Scanner;

public class Product_2Number {
    public static int product(int num1,int num2){
        int Product = num1*num2;
        return Product;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two number -> ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int Product = product(n1,n2);
        System.out.println("Product of two number is -> "+Product);
    }
}
