package _LinkedList;

import java.util.LinkedList;

public class linkedList_JCF {
    public static void main(String[] args) {
        // create -> stores objects
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
