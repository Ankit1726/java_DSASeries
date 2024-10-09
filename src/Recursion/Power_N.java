package Recursion;

public class Power_N {
    public static int power(int x,int n){
        if (n == 0){
            return 1;
        }
       int Xnm1 =  power(x,n-1);
       int Xn = x*Xnm1;
       return Xn;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}
