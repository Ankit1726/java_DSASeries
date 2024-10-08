package Strings;
import java.util.Scanner;

public class Shortest_Path {
    public static float getPath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // South
            if (dir == 'S'){
                y--;
            }
            // North
           else if (dir == 'N'){
                y++;
            }
            // East
           else if (dir == 'E'){
                x++;
            }else {
               x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return  (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your Direction -> (E,W,N,S)");
        String str = input.nextLine();
        System.out.println("Shortest Path -> "+getPath(str));
    }
}
