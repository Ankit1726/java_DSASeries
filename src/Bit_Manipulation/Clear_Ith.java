package Bit_Manipulation;

public class Clear_Ith {
    public static int clear_ith(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_ith(10,1));
    }
}
