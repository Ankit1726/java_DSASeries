package Functions;
import java.util.Scanner;

public class Average_3Num {
    public static int Average(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your 3 number -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int Avg = Average(a,b,c);
        System.out.println("Average of 3 number is -> "+Avg);
    }
}
