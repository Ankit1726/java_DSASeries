package OOPS_Java;

import Variables_Datatype.Average_Num;

public class Polymorphism {
    public static void main(String[] args) {
        calculator cal =  new calculator();
        System.out.println(cal.sum(1,5));
        System.out.println(cal.sum(2.4f,5.6f));
        System.out.println(cal.sum(4,6,7));
        Deer d = new Deer();
        d.eat();
    }
}
   // method overloading -> compile time polymorphism
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
class animal{
    void eat(){
        System.out.println("Eats Anything...");
    }
}
class Deer extends animal{
    void eat(){
        System.out.println("Eats Grass....");
    }
}
