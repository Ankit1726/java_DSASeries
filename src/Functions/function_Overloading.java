package Functions;

public class function_Overloading {
    /*
    when multiple function with same name but different parameters
   */

    // Using Parameters
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    // Using dataTypes
    public static float Product(float a ,float b){
        return a*b;
    }
    public static double Product(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,6));
        System.out.println(sum(5,7,9));
        System.out.println(Product(5f,6f));
        System.out.println(Product(646.6,466.7));
    }
}
