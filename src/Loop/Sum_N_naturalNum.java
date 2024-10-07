package Loop;
import java.util.Scanner;

public class Sum_N_naturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your range -> ");
        int range = input.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=range){
            sum+=i;
            i++;

        }
        System.out.print("Total Sum of N natural number -> "+sum);
    }
}
