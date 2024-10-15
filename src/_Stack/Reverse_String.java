package _Stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String {
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your string -> ");
        String str = input.nextLine();
        String result = reverseStr(str);
        System.out.println(result);
    }
}
