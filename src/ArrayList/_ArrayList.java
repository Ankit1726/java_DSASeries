package ArrayList;

import java.util.ArrayList;

public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ADD
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,8);
        System.out.println(list);

        // Get Operation
        int e = list.get(2);
        System.out.println(e);

        // Remove Element
        list.remove(1);
        System.out.println(list);

        // Set element st index
        list.set(2,7);
        System.out.println(list);

        // Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
