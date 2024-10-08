package Variables_Datatype;

import java.util.Scanner;

public class GST_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your item cost -> ");
        float pen = input.nextFloat();
        float pencil = input.nextFloat();
        float eraser = input.nextFloat();

        float total = pencil+pen+eraser;
        System.out.println("Total Cost of item is -> "+total);

        // Add 18% GST
        float newTotal = total+(0.18f*total);
        System.out.println("Total Bill Cost include 18% GST -> "+newTotal);

    }
}
