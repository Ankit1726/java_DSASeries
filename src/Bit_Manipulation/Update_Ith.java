package Bit_Manipulation;

public class Update_Ith {
    public static int clear_ith(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int update_ith(int n,int i,int newBit){
        n = clear_ith(n,i);
        int bitMask = newBit<<i;
        return n|bitMask;

    }
    public static void main(String[] args) {
        System.out.println(update_ith(10,2,1));
    }
}
