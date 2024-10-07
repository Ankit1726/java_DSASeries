package Functions;

import java.util.Scanner;

public class Swap_2Number {
    // Java always used call by value
    public static void Swap(int a,int b) {
        // Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping....");
        System.out.println("Value of a -> "+a);
        System.out.println("Value of b -> "+b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your two number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        Swap(a,b);
        }
    }

