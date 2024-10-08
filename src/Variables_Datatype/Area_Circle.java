package Variables_Datatype;

import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your radius -> ");
        int r = input.nextInt();
        int Area =(int)Math.PI*r*r;
        System.out.println("Area of Circle is -> "+Area);
    }
}
