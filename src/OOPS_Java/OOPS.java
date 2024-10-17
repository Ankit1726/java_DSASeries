package OOPS_Java;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        bankAccount myAcc = new bankAccount();
        myAcc.username = "Ankit";
        System.out.println(myAcc.username);
        myAcc.setPassword(("gfgfgffh"));

    }

}
class bankAccount{
   public String username;
   private String password;
   public void setPassword(String pwd){
       password = pwd;
   }


}
class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percent;

    void CalPercent(int phy,int maths,int chem){
        percent = (phy+maths+chem)/3;
    }
}