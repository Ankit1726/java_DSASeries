package Bit_Manipulation;

public class Set_Ith {
    public static int set_Ith(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(set_Ith(10,2));
    }
}
