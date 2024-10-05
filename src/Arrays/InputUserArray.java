package Arrays;
import java.util.Scanner;

public class InputUserArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str[] = new String[5];
        System.out.println("pls add your food items");

        str[0] = input.next();
        str[1] = input.next();
        str[2] = input.next();
        str[3] = input.next();
        str[4] = input.next();

        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
}
