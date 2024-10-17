package OOPS_Java;

public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        Dogs Bob = new Dogs();
        Bob.legs = 4;
        System.out.println(Bob.legs);
        Bob.eat();

    }
}
// parent class
class  Animal{
    String color;
    void eat(){
        System.out.println("Eats....");
    }
    void breathe(){
        System.out.println("Breathing..");
    }
}
class mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}
class Dogs extends mammals{
    String breed;
}
// child class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water...");
    }
}

