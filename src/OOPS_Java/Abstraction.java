package OOPS_Java;

public class Abstraction {
    public static void main(String[] args) {
        male m = new male();
        m.eat();
        m.walk();
        System.out.println();
        female f = new female();
        f.eat();
        f.walk();
    }
}
 abstract class human{
    void walk(){
        System.out.println("Human walks on two legs..");
    }
    abstract void eat();
 }
 class male extends human{
    void eat(){
        System.out.println("eats pani puri alot...");
    }
 }
 class female extends human{
    void eat(){
        System.out.println("eat evening tea alot...");
    }
 }
