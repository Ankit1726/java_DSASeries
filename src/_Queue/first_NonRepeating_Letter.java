package _Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class first_NonRepeating_Letter {
    public static void printNon_Repeat(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a'] >1){
                q.remove();
            }
            if (q.isEmpty()){
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pls enter your string -> ");
        String str = input.nextLine();
        printNon_Repeat(str);
    }
}
