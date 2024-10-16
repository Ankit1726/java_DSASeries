package _Stack;

import java.util.Scanner;
import java.util.Stack;

public class valid_Parenthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // opening bracket
            if (ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else {
                // closing
                if (s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')||
                        (s.peek() == '{' && ch == '}')
                    ||(s.peek() == '[' && ch == ']')){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter your parenthesis brackets -> ");
        String str = input.nextLine();
        System.out.println(isValid(str));
    }
}
