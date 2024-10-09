package Bit_Manipulation;

public class Even_Odd {
    public static void Odd_Even(int n){
        int bitMask = 1;
        if ((n & bitMask)== 0){
            // even
            System.out.println("Even Number ");
        }else {
            System.out.println("Odd Number ");
        }
    }
    public static void main(String[] args) {
        Odd_Even(3);
        Odd_Even(11);
        Odd_Even(14);
    }
}
