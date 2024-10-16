package _Stack;
import java.util.Scanner;
import java.util.Stack;

public class duplicate_Parenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //closing
            if (ch == ')'){
                int count = 0;
                while (s.peek() !='('){
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;   // duplicate exist
                }else {
                    s.pop(); // opening pair
                }
            }  else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your expression...");
        String str = input.nextLine();
        System.out.println(isDuplicate(str));
    }
}
