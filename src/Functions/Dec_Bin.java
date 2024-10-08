package Functions;

public class Dec_Bin {
    public static void dec_bin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n>0){
            int rem = n%2;
            binNum = binNum+(rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary form of "+myNum+" = "+binNum);
    }
    public static void main(String[] args) {
        dec_bin(7);
    }
}
