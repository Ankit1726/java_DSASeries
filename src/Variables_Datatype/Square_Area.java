package Variables_Datatype;

import java.util.Scanner;

public class Square_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your side -> ");
        int side = input.nextInt();
        int area = side*side;
        System.out.println("Area of Square is -> "+area);
    }
}
