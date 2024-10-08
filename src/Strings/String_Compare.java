package Strings;

public class String_Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
         // String can compare reference not exact value
        if (s1 == s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equals");
        }
        if (s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equals");
        }
        // equals() -> it can compare exact value of string not reference value
        if (s1.equals(s3)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equals");
        }
    }
}
